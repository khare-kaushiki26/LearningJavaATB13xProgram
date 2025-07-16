package Interface_in_java;

public class Engine_interface {

}

interface Engine
{
    void startEngine();
    void stopEngine();
}

class DriveCar implements Engine
{
    @Override
    public void startEngine()
    {
        System.out.println("Engine is starting");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Engine is stopped");
    }

}

