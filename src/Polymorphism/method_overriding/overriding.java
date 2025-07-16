package Polymorphism.method_overriding;


// REAL TIME EXAMPLE WHERE WE WOULD USE METHOD OVERRIDING
public class overriding {
    public static void main(String[] args) {
        ChromeBrowser cb = new ChromeBrowser();
        cb.OpenBrowser();
        CommonForAll c =new CommonForAll();
        c.OpenBrowser();
        // DYNAMIC DISPATCH
        CommonForAll ab = new ChromeBrowser();
        // this will print chrome browser because the object created is of Chrome browser and
        // only the reference used is for the commonforall class
        ab.OpenBrowser();
    }
}
class CommonForAll
{
    void OpenBrowser()
    {
        System.out.println("Opening Browser firefox");
    }
}
class ChromeBrowser extends CommonForAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Opening Chrome Browser");
    }
}