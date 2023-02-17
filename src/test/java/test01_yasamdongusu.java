import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test01_yasamdongusu {

    /**
     * ilk önce çalışan kısımdır ve tekrar etmez
     */
    @BeforeAll
    void initAll(){

        System.out.println("1. Adım");
    }

    /**
     * 2. adımda çalışır ve her test için ayrı ayrı çalışmaya devam eder.
     */
    @BeforeEach
    void init(){
        System.out.println("2. Adım repeat");
    }

    @Test
    void ornekBasariliTest(){
        System.out.println("Test işlemi yapıldı.");
    }

    @Test
    void ornekBasarisizTest(){
        fail("Test olmadi maalesef :(");
        System.out.println("Burada bir test olcaktı. :)");
    }

    @Test
    @Disabled("artik calismam")
    void ornekKapatilmisTest(){
        System.out.println("Diğer bir test örneği");
    }

    @Test
    void abortedTest(){
        assertEquals(8,"Muhammet".length());
        fail("yarı yolda bırakıldım");
    }

    /**
     * Her  test sonlandıktan sonra tekrar tekrar çalışan kısım
     */
    @AfterEach
    void sonCalisan(){
        System.out.println("Son tekrar tekrar çalışan kumotlar");
    }

    /**
     * tüm test ve kodlamalar bittikten sonra çalışan kısım
     */
    @AfterAll
    void sonUtucu(){
        System.out.println("Ben en son cikarim....");
    }
}
