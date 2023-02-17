import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Bu sinif kullanici veritabani icin testler sunar")
public class test02_DisplayName {

    @Test
    @DisplayName("Kullanici adina göre tum kullanicilari listele")
    void findAllByUserNameTest(){
        System.out.println("tum kullanici listesini getirdim.");
    }

    @Test
    @DisplayName("😱")
    void nelerOldu(){

    }

    @Nested
    class nestedClassornek{

        @Test
        @DisplayName("ic sinif icin bir ornek")
        void testDeneme(){

        }
    }
}
