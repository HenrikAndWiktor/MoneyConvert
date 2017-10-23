package se.wiktoreriksson.moneycon;

public class ConvertImpl implements IConvert {
    public void convert(Input i, Currency toCur) {
        Currency fromCur=i.getCur();
        System.out.print(fromCur+"\n");
        double val=i.getVal();
        System.out.print(val+"\n");
        double btcval=fromCur.getBTC()*val;
        System.out.print(btcval+"\n");
        double btctoval=toCur.getBTC();
        System.out.print(btctoval+"\n");
    }
    public double curOf(Input i){
        throw new RuntimeException("You can't do this!");
    }
    public double valOf(Input i) {
        throw new RuntimeException("You can't do this!");
    }
}
