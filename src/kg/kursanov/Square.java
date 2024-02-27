package kg.kursanov;

public class Square extends Shape{

    private double birinchiJagy;
    private double ekinchiJagy;
    private double uchunchuJagy;
    private double tortunchuJagy;

    public Square(double birinchiJagy, double ekinchiJagy, double uchunchuJagy, double tortunchuJagy) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
        this.uchunchuJagy = uchunchuJagy;
        this.tortunchuJagy = tortunchuJagy;
    }

    @Override
    public double getPerimeter() {
        double res = birinchiJagy + ekinchiJagy + uchunchuJagy + tortunchuJagy;
        return res;
    }

}
