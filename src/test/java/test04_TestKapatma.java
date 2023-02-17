import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class test04_TestKapatma {

    @Test
    void calianTest(){
        System.out.println("Çalışıyor");
    }

    @Test
    @Disabled
    void  kapaliTest(){
        System.out.println("Bu test kapalı");
    }
}
