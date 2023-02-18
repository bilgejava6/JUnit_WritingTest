import static org.junit.jupiter.api.Assertions.*;

import entity.Cinsiyet;
import entity.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.*;

import java.util.EnumSet;

public class test08_Parameter {


    @ParameterizedTest
    @ValueSource(strings = {"muhammet"})
    void parametreKullanimi(String ifade){
        assertTrue(ifade.startsWith("m"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"muhammet","ayşe","deniz","hakan"})
    void cokluParametreKullanimi(String ifade){
        assertTrue(ifade.startsWith("m"));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,32,1,53,9})
    void cokluIntegerKullanimi(int sayi){
        assertTrue(sayi %2 == 1,"Tek sayı Değil");
    }

    /**
     * Burada ENUM için girilen değerler eğer ENUM CLass içinde var olan
     * değerler ile eşleşmez ise test bu işlemi başlatamıyor.
     * @param cinsiyet
     */
    @ParameterizedTest
    @EnumSource(names = {"Female","Male"})
    void enumKullanimi(Cinsiyet cinsiyet){
        assertTrue(
                EnumSet.of(Cinsiyet.Female).contains(cinsiyet)
        );
    }

    @ParameterizedTest
    @CsvSource({
            "Muhammet,  40",
            "Deniz,     34",
            "Benan,     12"
    })
    void csvKullanimi(String user, int age){
        assertNotNull(user);
        System.out.println("Kullanıcı....: "+ user);
        assertTrue(age>18);
    }

    /**
     * Parametre olarak aranılan tüm alanlar için mutlaka CSV dosyası içinde
     * içi boş dahi olsa virgül(,) ile ayrılmış bir alanın olması gereklidir.
     * Aksi takdirde test bu değeri atayamadığı için hata verecektir.
     * @param user
     * @param age
     * @param adres
     */
    @ParameterizedTest
    @CsvFileSource(resources = {"/kullanicilistesi.csv","test2.csv"})
    void csvSourceKullanimi(String user, int age, String adres){
        assertNotNull(user);
        System.out.println("Kullanıcı....: "+ user);
        System.out.println("Adres........: "+ adres);
        assertTrue(age>18);
    }

    /**
     * Belli bir konumda bulan dosyaları kullanmak için files tercih ederiz.
     * -> e:/testfiles/test1.csv
     * @param user
     * @param age
     * @param adres
     */
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/kullanicilistesi.csv")
    void csvFileSourceKullanimi(String user, int age, String adres){
        assertNotNull(user);
        System.out.println("Kullanıcı....: "+ user);
        System.out.println("Adres........: "+ adres);
        assertTrue(age>18);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "MOCK_DATA.csv",numLinesToSkip = 900)
    void csvArgumentKullanimi(ArgumentsAccessor arg){
        User user = new User(
                arg.getLong(0), // id
                arg.getString(1),// ad
                arg.getString(2),//soyad
                arg.getString(3), //adres
                arg.getString(4), // telefon
                arg.get(5, Cinsiyet.class)
        );
        System.out.println(user.toString());
        assertTrue(user.getAd().startsWith("A"));
    }

}
