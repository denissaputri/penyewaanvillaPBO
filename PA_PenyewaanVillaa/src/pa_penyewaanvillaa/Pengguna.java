package PA_Penyewaanvillaa;

public abstract class Pengguna {
    protected String user, pass;

    public Pengguna(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    void display(){
        
    }
    
}
