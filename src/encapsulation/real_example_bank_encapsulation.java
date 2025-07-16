package encapsulation;

public class real_example_bank_encapsulation {
    public static void main(String[] args) {
        ICICIBank kaushiki = new ICICIBank("Kaushiki Khare", 5000000);
        // balance cannot be accessed as it is private

        // kaushiki.balance;
        // if we use getter setter function , then we can access the private variables
        System.out.println(kaushiki.getBalance());
        System.out.println(kaushiki.getName());
        kaushiki.setBalance(2500000, true);
        System.out.println("When the amount is reset by the cashier: ");
        System.out.println(kaushiki.getBalance());
        System.out.println("When amount is not updated by the cashier: ");
        kaushiki.setBalance(25000000, false);
        System.out.println(kaushiki.getBalance());

    }
}
class ICICIBank
{
    private String name;
    private long balance;
    // PARAMETERIZED CONSTRUCTOR
    public ICICIBank(String name , long bal)
    {
        this.name = name;
        this.balance=bal;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean iscashier) {
        if (iscashier == true)
        {
            this.balance = balance;

        }
        else {
            System.out.println("We cannot update the amount because you are not the cashier");
        }
    }
}
