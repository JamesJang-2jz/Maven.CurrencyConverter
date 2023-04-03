package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/ CurrencyType.FRANC.getRate();
    }

    @Override
    public CurrencyType getType() {
        return CurrencyType.FRANC;
    }
}
