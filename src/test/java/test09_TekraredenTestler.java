import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class test09_TekraredenTestler {

    @RepeatedTest(10)
    void tekrarEdenTest(){
        System.out.println("Bu test tekrar ediyor");
    }

    @RepeatedTest(value = 3,name = "{displayName} {currentRepetition}. Deneme /{totalRepetitions} TEST")
    @DisplayName("Gorunen Ad Degistirme")
    void tekrarDisplayMode(){
        System.out.println("Özel Tekrar Modu");
    }
}
