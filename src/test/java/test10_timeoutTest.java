import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class test10_timeoutTest {

    @Test
    @Timeout(1)
    void testUzunSurenMethod() throws InterruptedException {
        Thread.sleep(1900);
        System.out.println("Uzun Test");
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testUzunSurenMethod2() throws InterruptedException {
        Thread.sleep(499);
        for(int i=0;i<10_000_000;i++)
            if(i==999_999)
                System.out.println("Uzun Test");
    }

}
