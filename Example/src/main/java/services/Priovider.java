package services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public interface Priovider {
    BigDecimal getRate(BigDecimal rate);
}