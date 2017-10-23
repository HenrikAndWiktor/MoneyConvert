package se.wiktoreriksson.moneycon;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            JSONObject json = new JSONObject(new JSONTokener(new URL("http://free.currencyconverterapi.com/api/v4/convert?q=EUR_BTC&compact=ultra").openStream()));
            Currency.EUR=new Currency(json.getDouble("EUR_BTC"));
            json = new JSONObject(new JSONTokener(new URL("http://free.currencyconverterapi.com/api/v4/convert?q=SEK_BTC&compact=ultra").openStream()));
            Currency.SEK=new Currency(json.getDouble("SEK_BTC"));
        } catch (IOException e){
            e.printStackTrace();
        }
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
