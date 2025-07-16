package Access_modifiers.Police;

public class jr_cop {
    public static void main(String[] args) {
        // we are able to use the cop class reference here because the package is same
        // even though the CanIShoot function is protected
        Cop jrcop = new Cop(10);
        jrcop.CanIShoot();

    }

}
