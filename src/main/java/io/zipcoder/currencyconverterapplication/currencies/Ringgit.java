package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/ CurrencyType.RINGGIT.getRate();
    }

    @Override
    public CurrencyType getType() {
        return CurrencyType.RINGGIT;
    }
}
