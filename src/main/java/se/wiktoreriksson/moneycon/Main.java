package se.wiktoreriksson.moneycon;

public class Main {
    public static void main(String[] args) {
        new ConvertImpl() {
            @Override
            public void convert(Input i, Currency toCur) {
                super.convert(i, toCur);
            }

            @Override
            public double curOf(Input i) {
                return 0;
            }

            @Override
            public double valOf(Input i) {
                return 0;
            }
        }.convert(new Input(Currency.SEK,2),Currency.EUR);
    }
}
