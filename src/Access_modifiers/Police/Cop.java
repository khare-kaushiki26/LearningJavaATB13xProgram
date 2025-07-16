package Access_modifiers.Police;

public class Cop {
    protected int gun;
    Cop(int bullet)
    {
        this.gun =bullet;
    }
    protected void CanIShoot()
    {
        System.out.println("Yes you can shoot");
    }
}
