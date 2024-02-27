package kg.kursanov;

public class Octagonal extends Shape{
    private double birinchiJagy;
    private double ekinchiJagy;
    private double uchunchuJagy;
    private double tortunchuJagy;
    private double beshinchiJagy;
    private double altynchyJagy;
    private double jetinchiJagy;
    private double segizinchiJagy;

    public Octagonal(double birinchiJagy, double ekinchiJagy, double uchunchuJagy, double tortunchuJagy, double beshinchiJagy, double altynchyJagy, double jetinchiJagy, double segizinchiJagy) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
        this.uchunchuJagy = uchunchuJagy;
        this.tortunchuJagy = tortunchuJagy;
        this.beshinchiJagy = beshinchiJagy;
        this.altynchyJagy = altynchyJagy;
        this.jetinchiJagy = jetinchiJagy;
        this.segizinchiJagy = segizinchiJagy;
    }

    @Override
    public double getPerimeter() {
        double res = beshinchiJagy + ekinchiJagy + uchunchuJagy +tortunchuJagy + beshinchiJagy
                + altynchyJagy + jetinchiJagy + segizinchiJagy;
        return res;
    }
}
