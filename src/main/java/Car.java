public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
     */
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
        public double getCarPrice(){

            return carPrice;
    }
}


    class Sedan extends Car {
        float length;

        public Sedan(double carPrice, String color, float length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            double price = getCarPrice();
            if (length > 20) {
                return price - ((price / 100) * 5);
            } else
                return price - ((price / 100) * 10);
        }
    }

    class Truck extends Car {
        float weight;

        public Truck(double carPrice, String color, float weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            double price = getCarPrice();
            if (weight > 2000) {
                return price - ((price / 100) * 10);
            } else
                return price - ((price / 100) * 20);
        }
    }

    class CarTester {
        public static void main(String[] args) {
            Car[] arr = {new Sedan(24999.99, "White", 17),
                    new Truck(32599.99, "Red", 4500)};
            for (Car c : arr) {
                System.out.println("The price is " + c.calculateSalePrice());

            }
        }
    }

