import java.util.Scanner;

protected class bankAccount {

    string firstName;
    string lastName;
    int accountID;
    double balance;

    //constructor
    bankAccount(){
balance = 0.00;
        }
    deposit(double addSum){
balance += addSum;
        }
    withdrawl(double subtractSum){
balance -= subtractSum;
        }
    // setters
    setFirstName(string firstname){
firstName = firstname;
        }
    setLastName(sring lastname){
lastName=lastname;
        }
    setAccountID(int accountid){
accountID=accountid;
        }
    // getters
    string getFirstName(){
return firstName;
        }
    string getLastName(){
return lastName;
        }
    int getAccountID(){
return accountID;
        }

    // functions
   double getBalance(){
return balance;
        }
    void accountSummary(){
System.out.println("Account Summary for "+firstName+" "+lastName
                   +"/nAccount ID: "+accountID+"/nBalance: "+balance);
        }


    }