package Interface_in_java;

public class multiple_inheritance_using_interface {
    public static void main(String[] args) {
        Son s =new Son();
        s.money();
    }
}
interface Father1
{
    void money ();
}

interface Father2
{
    void money ();
}

class Son implements Father1, Father2
{
    @Override
    public void money()
    {
        System.out.println("Only son has the money and both the fathers have zero money");
    }
}