import com.muhammet.Islemler;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class test03_AssertUsing {

    private final Islemler islemler= new Islemler();

    @Test
    void standartAsseritons() throws Exception {
        assertEquals(14,islemler.toplam(9,5));
        assertEquals(45,islemler.carpim(9,5),"Sanırım bir şeyler yanlış gitti");
        assertTrue(islemler.bolum(90,10)==9);
        assertTrue(islemler.bolum(90,10)==10, ()-> "bir seyler yazmak gerek");
    }

    @Test
    void groupedAssertions(){
        assertAll("Ilk seri kontrol listesi",
                ()-> assertEquals(5,islemler.toplam(3,2)),
                ()-> assertTrue(20>islemler.bolum(200,4))
        );
    }

    @Test
    void exceptionTesting(){
        Exception exception = assertThrows(Exception.class,()-> islemler.bolum2(2,0));
        assertEquals("/ by zero",exception.getMessage());
    }

    @Test
    void exceptionTestingInnerCode(){
        Exception exception = assertThrows(ArithmeticException.class,()->{
            int i=1, s=0;
            int bolum = i/s;
        });
        assertEquals("/ by zero",exception.getMessage());
    }

    @Test
    void timeoutTest(){
        assertTimeout(Duration.ofSeconds(1),()->{
            System.out.println("Islem basladi");
            Thread.sleep(800);
            System.out.println("Islem Bitti");
        });
    }

    @Test
    void timeoutResultTest(){
        String result = assertTimeout(Duration.ofMinutes(1),()->{
            return "islem tamam";
        }) ;
        assertEquals("islem tamam", result);
    }

}
