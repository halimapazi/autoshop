public class MyownAutoShop{

    public static void main(String[] args) {
        Truck truck = new Truck(600,600, "pink",20);
        System.out.println("truck" + truck.getsalePrice());

        Ford fd = new Ford(300, 300.10, "red",400, 30);
        System.out.println("fd" + fd.getsalePrice());

        Sedan sedan = new Sedan(300, 300, "green", 40);
        System.out.println("sedan" + sedan.getsalePrice());

        Car car = new Car(100, 100, "red");
        System.out.println("car" + car.getsalePrice());
    }
}


