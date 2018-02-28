package com.github.jrry.webmvc.converters;

import org.springframework.core.convert.converter.Converter;
import com.github.jrry.webmvc.dto.TwoParameters;

public class StringToParameters implements Converter<String, TwoParameters> {
    @Override
    public TwoParameters convert(String source) {
        return new TwoParameters(source.substring(0, source.indexOf('-')), source.substring(source.indexOf('-') + 1));
    }
}
