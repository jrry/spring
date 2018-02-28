import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan("services")
public class AppConfig {

    @Bean
    public String fileName1() {
        return "super plikowy konwerter";
    }

    @Bean
    public String fileName2 () {
        return "plikowy konwerter";
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("i18n/msg");
        resourceBundleMessageSource.setDefaultEncoding("UTF-8");
        return resourceBundleMessageSource;
    }

//    @Bean
//    public PrioviderWaluty plikowyKonwerter() {
//        return new PlikowyKonwerter();
//    }
//
//    @Bean
//    public KonwerterWalut konwerterWalut() {
//        KonwerterWalut konwerterWalut = new KonwerterWalut(plikowyKonwerter());
//        return konwerterWalut;
//    }
}
