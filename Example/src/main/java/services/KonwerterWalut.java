package services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class KonwerterWalut {

    private Priovider prioviderWaluty;

    public KonwerterWalut(Priovider prioviderWaluty) {
        this.prioviderWaluty = prioviderWaluty;
    }

    public BigDecimal Konwertuj(BigDecimal cos) {
        System.out.println("konwertuje");
        return BigDecimal.valueOf(100.00).multiply(prioviderWaluty.getRate(BigDecimal.valueOf(4.20)));
    }

}
