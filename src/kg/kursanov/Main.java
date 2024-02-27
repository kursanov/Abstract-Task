package kg.kursanov;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.err.println("____Периметрлер_____");
        System.out.println("Tегерек : "+circle.getPerimeter());

        Square square = new Square(4,5,4,5);
        System.out.println("Торт бурчтук : "+square.getPerimeter());

        Rectangular rectangular = new Rectangular(12,4,12,4);
        System.out.println("Тик бурчтук : "+ rectangular.getPerimeter());

        ThreeSquare threeSquare = new ThreeSquare(12,23,13);
        System.out.println("Уч бурчтук : " + threeSquare.getPerimeter());

        Octagonal octagonal = new Octagonal(1,2,3,4,5,6,7,8);
        System.out.println("Сегиз бурчтук : "+octagonal.getPerimeter());
    }
}
