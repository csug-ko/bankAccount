import.java.util*;

private class checkingAccount extends bankAccount{
    double interestRate;

   void processWithdrawl(double subtractionFunds){
balance -=subtractionFunds;
        }
void displayAccount(){
accountSummary();
    System.out.println("Interest Rate: "+interestRate);
    }
    }