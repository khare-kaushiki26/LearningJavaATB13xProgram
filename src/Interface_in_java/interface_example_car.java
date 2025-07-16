package Interface_in_java;

public class interface_example_car {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();

    }
}

class Car implements Engine, Brakes
{
    @Override
    public void Brake()
    {
        System.out.println("Brake is applied");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
    }
    void drive ()
    {
        startEngine();
        Brake();
        stopEngine();
    }
}







interface Brakes
{
    void Brake();

}
