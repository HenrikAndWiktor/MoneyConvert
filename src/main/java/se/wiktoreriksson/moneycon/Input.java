package se.wiktoreriksson.moneycon;

public class Input {
    private Currency mCur;
    private double mVal;

    public Input(Currency cur, double val) {
        this.mCur = cur;
        this.mVal = val;
    }

    public Currency getCur() {
        return mCur;
    }

    public void setCur(Currency mCur) {
        this.mCur = mCur;
    }

    public double getVal() {
        return mVal;
    }

    public void setVal(double mVal) {
        this.mVal = mVal;
    }
}
