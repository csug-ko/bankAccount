import java.awt.*;
public class bankAccountInterface extends JFrame{

// Variable declarations
private double balance;
private int accountID;
public String firstName, lastName;

// Create frame
JFrame frame = new JFrame(" Bank Account ");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
private Button donebutton;
JTextField tfAccountID, tfFirstName, tfLastName, tfbalance, tfbalancechange;

public class bankAccount{
// Methods
//getters
double getBalance(){return balance;}
String getName(){String returnthis = firstName + " " + lastName; return returnthis;}
//setters
public void changeAccount(double amount){balance+=amount;}
public void setBalance(double amount){balance=amount;}
public void setFirstName(String Fname){firstName = Fname;}
public void setLastName(String Lname){lastName = Lname;}
public void setAccountID(int id){accountID=id;}}
 
 public bankAccountInterface(){
 setSize(280,150);
Container contentPane = getContentPane();
JPanel myPanel = new JPanel();
myPanel.add(new JTextField(balance,10));
contentPane.setLayout(new FlowLayout());
contentPane.add(new JLabel("First Name : "));
tfFirstName = new JTextField("",10);
contentPane.add(new JLabel("Last Name : "));
tfLastName = new JTextField("",10);
contentPane.add(new JLabel("Account ID : "));
tfAccountID = new JTextField("",10);
contentPane.add(new JLabel("Balance : "));
tfbalance = new JTextField("",10);
setVisible(true);

addWindowListener(new WindowAdapter(){
@Override
public void windowClosing(WindowEvent evt){System.exit(0);}}
donebutton= new Button("Done");
add(donebutton);
donebutton.addActionListener(new ClickListener());




 }


}