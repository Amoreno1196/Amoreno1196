
/**
 *
 * @author Angel
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class EX_9_1 {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
Account ac=new Account(1,5000.00);
System.out.println("Enter the annual intrest rate");
double intrestRate=sc.nextDouble();
ac.setAnnualIntrestRate(intrestRate);
Date d=new Date();
Calendar currentDate = Calendar.getInstance();
ac.setDateCreated(currentDate.getTime());
System.out.println("Date "+ac.getDateCreated());
System.out.println("Monthly intrest rate :"+ac.getMonthlyInterestRate());
System.out.println("Monthly intrest :"+ac.getMonthlyInterest());
System.out.println("Enter Amount for deposit ");
double depositAmount=sc.nextDouble();
System.out.println("The amount after deposit :"+ac.deposit(depositAmount));
System.out.println("Enter Amount to withdraw :");
double withdramount= sc.nextDouble();
System.out.println("The amount remain after with draw "+ac.withDraw(withdramount));
System.out.println("The total amount "+ac.totalBalance());

}

}

public class Account {

private int id=0;
private double balance=0;
private double annualIntrestRate=0;
private Date dateCreated;

public Account() {
super();
}




public Account(int id, double balance) {
super();
this.id = id;
this.balance = balance;
}





public int getId() {
return id;
}




public void setId(int id) {
this.id = id;
}




public double getBalance() {
return balance;
}




public void setBalance(double balance) {
this.balance = balance;
}




public double getAnnualIntrestRate() {
return annualIntrestRate;
}



public void setAnnualIntrestRate(double annualIntrestRate) {
this.annualIntrestRate = annualIntrestRate;
}
public Date getDateCreated() {
return dateCreated;
}
public void setDateCreated(Date dateCreated) {
this.dateCreated = dateCreated;
}
public double getMonthlyInterestRate()
{
return (this.getAnnualIntrestRate()/12);
}
public double getMonthlyInterest()
{
return (getBalance() *getMonthlyInterestRate()/100);
}
public double withDraw(double balance)
{
this.setBalance(this.getBalance()-balance);
return this.getBalance();
}
public double deposit(double balance)
{
this.setBalance(this.getBalance()+balance);
return this.getBalance();
}
public double totalBalance()
{
balance =balance + getMonthlyInterest();
return balance;
}
}