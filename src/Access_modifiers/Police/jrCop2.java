package Access_modifiers.Police;

public class jrCop2 {
    public static void main(String[] args) {
        // we are able to use the cop class reference here because the package is same
        // even though the CanIShoot function is protected
        Cop jrcop2 =new Cop(24);
        jrcop2.CanIShoot();
    }
}
