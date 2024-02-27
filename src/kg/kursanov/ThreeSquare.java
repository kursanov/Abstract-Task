package kg.kursanov;

public class ThreeSquare extends Shape{

    private double birinchiJagy;
    private double ekinchiJagy;
    private double uchunchuJagy;

    public ThreeSquare(double birinchiJagy, double ekinchiJagy, double uchunchuJagy) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
        this.uchunchuJagy = uchunchuJagy;
    }

    @Override
    public double getPerimeter() {
        double res = birinchiJagy + ekinchiJagy +uchunchuJagy;
        return res;
    }
}
