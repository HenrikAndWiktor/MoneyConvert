package se.wiktoreriksson.moneycon;

enum ECurrency {
    EUR, SEK, BTC
}
class Currency {
    static Currency EUR, SEK, BTC=new Currency(1);
    private double mBTC;
    Currency(double BTC) {
        mBTC=BTC;
    }

    double getBTC() {
        return mBTC;
    }
}
