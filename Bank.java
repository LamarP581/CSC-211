
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author itlabs
 */
public class Bank {
/*
      private double amount;
      private ArrayList<Double> interactions;
       
       public  Bank(){
       this.amount = 0.0;
       this.interactions =  new ArrayList<>(5);
   }
       */
    double amount = 0.0;
    ArrayList<Double> interactions = new ArrayList<>(10);
    
       public void deposit(double amount){
           if (amount > 0){
               this.amount += amount;
               interactions.add(amount);
           }
           else {
               System.out.println("Deposit amount must be positive.");
           }
       }
       public void withdraw(double amount) {
           if (this.amount >= amount) {
               this.amount -= amount;
               interactions.add(-amount);
           }
           else if (this.amount < amount) {
               System.out.println("Insufficient funds for withdrawal.");
           }
           else{
               System.out.println("Withdrawal amount must be positive.");
           }
       }
       
      public void listInteractions() {
          for (double interaction : interactions){
              if (interaction > 0){
                  System.out.println("Deposit: " + interaction);
              }
              else {
                  System.out.println("Withdrawal: " + (-interaction));
              }
          }
          }
      public double getBalance() {
              return this.amount;
      }
       
       
   
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.deposit(200.0);
        myBank.withdraw(50.0);
        myBank.deposit(100.0);
        myBank.withdraw(30.0);
        
        System.out.print("Curent Balance: " + myBank.getBalance());
        myBank.listInteractions();
    }
    
}
