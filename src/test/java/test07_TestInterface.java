import interfaces.ITestInterface;
import org.junit.jupiter.api.Test;

public class test07_TestInterface implements ITestInterface {
    @Test
    void testDeneme() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Burada çalışır.");
    }

    @Test
    void testDeneme2() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Burada çalışır. 2");
    }

}
