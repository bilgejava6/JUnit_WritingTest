import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;


import static org.junit.jupiter.api.condition.OS.*;

public class test05_KosulluTestler {
    /**
     * İşletim sisteminwe dayalı olarak çalışan testler
     */
    @Test
    @EnabledOnOs(MAC)
    void onlyOnMac(){
        System.out.println("Sadece MAC üzerinde çalış");
    }

    @Test
    @EnabledOnOs(WINDOWS)
    void onlyOnWIN(){
        System.out.println("Sadece Windows üzerinde çalış");
        System.out.println("Sistem....: "+System.getProperty("os.arch"));
    }

    @Test
    @EnabledOnOs({LINUX,MAC})
    void testMulti(){

    }

    @Test
    @DisabledOnOs(WINDOWS)
    void disabledWindows(){

    }

    /**
     * Islemci mimarilerinde çalıştırma örnekleri
     */
    @Test
    @EnabledOnOs(architectures = "amd64")
    void islemciIntel(){
        System.out.println("İntel işlemcilerde çalışır");
    }



    @Test
    @EnabledOnOs(architectures = "aarch64")
    void islemciMAC(){
        System.out.println("MAC icin calisir");
    }

    /**
     * FArklı java sürümleri için test çalıştırmak
     */
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void java17Icin(){
        System.out.println("Java17 Test");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_19)
    void java19Icin(){
        System.out.println("Java19 Test");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_17,JRE.JAVA_19})
    //@EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_17)
    void java17Ve19Icin(){
        System.out.println("Java19 Test");
    }

}
