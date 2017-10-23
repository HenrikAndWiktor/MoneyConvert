package se.wiktoreriksson.moneycon;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.URL;

public class Currency {
    public static final Currency EUR=null, SEK=null, BTC=new Currency(1);
    static {
        try {
            JSONObject json = new JSONObject(new JSONTokener(new URL("http://free.currencyconverterapi.com/api/v4/convert?q=EUR_BTC&compact=ultra").openStream()));
            EUR=new Currency(json.getDouble("EUR_BTC"))
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private double mBTC;
    private Currency(double BTC) {
        mBTC=BTC;
    }

    double getBTC() {
        return mBTC;
    }
}
