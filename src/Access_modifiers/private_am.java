package Access_modifiers;

public class private_am {
    public static void main(String[] args) {
        son s=new son();
        System.out.println(s.bhk);
        System.out.println(s.car);
    }
}
class father
{
    private String gold ="10 grams";
    int car = 2;
    int bhk=4;

}
class son extends father
{
    void wecanuse()
    {
        // WE WONT BE ABLE TO USE GOLD VARIABLE AS IT IS PRIVATE AND IS NOT INHERITED
       // System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk);
    }

}