package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Profile("!prod")
public class PlikowyKonwerter implements Priovider {

    @Autowired
    @Qualifier("fileName2")
    private String fileName;

    @Autowired
    private Environment home;

    @Autowired
    private MessageSource messageSource;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BigDecimal getRate(BigDecimal rate) {
        System.out.println(fileName + " " + home.getProperty("JAVA_HOME") + " " + messageSource.getMessage("hello",null,null));
        return rate.multiply(BigDecimal.valueOf(2));
    }
}
