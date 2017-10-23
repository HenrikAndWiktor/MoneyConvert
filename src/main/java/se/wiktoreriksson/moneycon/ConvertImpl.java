package se.wiktoreriksson.moneycon;

public abstract class ConvertImpl implements IConvert {
    @Override
    public void convert(Input i, Currency toCur) {
        Currency fromCur=i.getCur();
        System.out.print(fromCur+"\n");
        double val=i.getVal();
        System.out.print(val+"\n");
        double btcval=fromCur.getBTC()*val;
        System.out.print(btcval+"\n");
        double btctoval=toCur.getBTC();
        System.out.print(btctoval+"\n");
        double x = btctoval*btcval;
        System.out.print(x+"\n");
    }
    public abstract double curOf(Input i);
    public abstract double valOf(Input i);

}
