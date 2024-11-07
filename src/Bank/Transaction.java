package Bank;

import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private double amount;


    public Transaction(Date date, String type, double amount) {

        this.date = date;
        this.type = type;
        this.amount = amount;

    }

    public Date getDate() {
        return date;
    }
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }



} //end of class
