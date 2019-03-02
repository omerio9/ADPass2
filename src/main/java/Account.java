import java.util.Date;

public class Account {

    private String id;
    private  String ownerName;
    private double balance;
    private Date accessTime;



    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
    public Date getAccessTime() {
        return accessTime;
    }




}
