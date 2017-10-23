package se.wiktoreriksson.moneycon;

public interface IConvert {
    void convert(Input i, Currency toCur);
    double curOf(Input i);
    double valOf(Input i);
}
