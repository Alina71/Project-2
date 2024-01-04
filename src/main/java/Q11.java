public class Q11 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code
     */
    public interface Shape {
        double calculateArea(double num);

        double calculatePerimeter(double num);
    }

    static class Circle implements Shape {

        @Override
        public double calculateArea(double num) {
            return  (Math.PI * num * num);
        }

        @Override
        public double calculatePerimeter(double num) {
            return  (2 * Math.PI * num);
        }
    }
        static class Square implements Shape {

            @Override
            public double calculateArea(double num) {
                return num * num;
            }

            @Override
            public double calculatePerimeter(double num) {
                return 4 * num;
            }
        }


    public static void main(String[] args) {
      Circle c= new Circle();
        double a=c.calculateArea(25.5);
        System.out.println("The area of the circle is "+a);
        double a1= c.calculatePerimeter(12.5);
        System.out.println("The perimeter of the circle is "+a1);
        Square s=new Square();
        double b=s.calculateArea(45.5);
        System.out.println("The area of the square is "+b);
        double b1=s.calculatePerimeter(23.5);
        System.out.println("The perimeter of the square is "+b1);
    }
}
