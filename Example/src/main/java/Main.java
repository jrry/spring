import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.KonwerterWalut;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        KonwerterWalut konwerterWalut = context.getBean(KonwerterWalut.class);
        System.out.println(konwerterWalut.Konwertuj(BigDecimal.TEN));
    }
}
