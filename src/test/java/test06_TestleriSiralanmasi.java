import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class test06_TestleriSiralanmasi {
    @Test
    @Order(2)
    void siralam2(){
        System.out.println("2. Sırtada Çalışan");
    }

    @Test
    @Order(1)
    void siralam1(){
        System.out.println("1. Sırtada Çalışan");
    }
    @Test
    @Order(3)
    void siralam3(){
        System.out.println("3. Sırtada Çalışan");
    }
}
