package encapsulation;

class VWOLogin
{
    public String username;
    public String password;
    public int age =90;
    void creds()
    {
        username="Hey123";
        password ="pass123";
        System.out.println(username);
        System.out.println(password);
    }
}
class GoodVWOLogin
{
    private String username ;
    private String password ;

    // parameterized constructor
    public GoodVWOLogin(String usr, String pwd)
    {
        this.username=usr;
        this.password=pwd;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}