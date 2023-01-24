abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public abstract void playMusic();
    int  ar;
}
abstract class  Mercedes extends Car{
    public abstract void breaks();
    @Override
    public void drive() {
        System.out.println("Driving");
    }


    @Override
    public void playMusic() {
        System.out.println("Musing");
    }
}
class AdvanceCar extends Mercedes{

    @Override
    public void fly() {
        System.out.println("Flying a car");
    }

    @Override
    public void breaks() {
        System.out.println("Break in car");

    }
}
public class Abtratcion {
    public static void main(String[] args) {
     Car car = new AdvanceCar();
     car.drive();
     car.fly();
     car.playMusic();
     AdvanceCar superCar = new AdvanceCar();//created bcz we can't access breaks
     superCar.breaks();
    }
}
