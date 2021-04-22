import java.util.Scanner;
import java.io.*;  //import java.io.BufferedReader,import java.io.IOException,import java.io.InputStreamReader,import java.nio.charset.StandardCharsets,
import java.nio.charset.StandardCharsets;
import java.util.*;

class BankWork
{
	final int max_limit = 20;
	final int min_limit = 1;
    final double min_bal = 500;
    private String name[] = new String[20];
    private int[] age = new int[20];
    private int income[] = new int[20];
    private int accNo[] = new int[20];
    private String accType[] = new String[20];
    private double balAmt[] = new double[20];
    static int totRec = 0;
    BankWork()
    {
        for (int i = 0; i < max_limit; i++)
        {
            name[i] = "";
            age[i] = 0;
            income[i] = 0;
            accNo[i] = 0;
            accType[i] = "";
            balAmt[i] = 0.0;
        }
    }
    //creating a new bank entry
    public void newEntry(){
    	 String str;
         int acno,age,income;
         double amt;
         boolean permit;
         permit = true;
         if(totRec > max_limit)
         {
        	 System.out.println("\n Sorry we could not admit you into our bank.");
        	 permit = false;
         }
         if(permit = true)
         {
        	 totRec++;
        	 System.out.println("------Recording New Entry-----");
        	 try 
        	 {
        		 accNo[totRec] = totRec;
        		 System.out.println("Account number : " + accNo[totRec]);
        		 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        		 System.out.println("Please enter your name : ");
        		 System.out.flush();
        		 name[totRec] = obj.readLine();
        		 System.out.println("Enter age: ");
        		 System.out.flush();
        		 str = obj.readLine();
                 this.age[totRec] = Integer.parseInt(str);
                 System.out.print("Enter Account Type : ");
                 System.out.flush();
                 accType[totRec] = obj.readLine();
                 do 
                 {
                     System.out.print("Enter the Initial Amount to be deposited : ");
                     System.out.flush();
                     str = obj.readLine();
                     balAmt[totRec] = Double.parseDouble(str);
                 } 
                 while (balAmt[totRec] < min_bal);
                     System.out.println("\n");
             } catch (Exception e) {}
         }
     }
    //displaying the details of the user
    public void display()
    {
    	String str;
    	int min_last =0;
    	int acno;
    	boolean valid = true;
    	System.out.println("-----Details of Customer------");
    	try
    	{
    		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    	    System.out.print("Please Enter your Account number : ");
    	    System.out.flush();
    	    str = obj.readLine();
    	    acno = Integer.parseInt(str);
    	    if(acno < min_last || acno > totRec)
    	    {
    	    	System.out.println("\n*Invalid Account Number.* ");
    	    	valid = false;
    	    }
    	    if(valid = true)
    	    {
    	    	System.out.println("\nAccount Number : " + accNo[acno]);
    	    	System.out.println("Name : " +name[acno]);
    	    	System.out.println("Age : " +age[acno]);
    	    	System.out.println("Account Type : " + accType[acno]);
    	        System.out.println("Balance Amount : " + balAmt[acno] + "\n");
    	    }
    	}
    	catch(Exception e) {}
    }
    //Educationloan
    public void eduloan()
    {
    	double principle;
    	double rate;
    	double time;
    	double monthlycost;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your income : ");
        int	income = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
    	try{	
    	    if(income >400000 && age > 15)
    	    { 
    	    	System.out.println("Do you have any surity for your loan(Enter Y or N): ");
    	    	System.out.println("Enter loan amount: ");
    	    	principle = sc.nextFloat();
    	    	System.out.println("Enter rate: ");
    	    	rate = sc.nextFloat();
    	    	System.out.println("Enter term in years: ");
    	    	time = sc.nextFloat();
    	    	rate = rate / (12*100);
    	    	time = time *12;
    	    	monthlycost = (principle * rate * Math.pow(1 + rate, time))/ (Math.pow(1 + rate, time) - 1);
    	    	System.out.println("The monthly amount that you need to pay is : " +monthlycost);
    	    	System.out.println("Your Education loan is approved");
    	    	System.out.println("Thankyou, visit again");
    	    }
    	    else
    	    {
    	    	System.out.println("Sorry, our bank cannot give the loan");
    	    	System.out.println("Thankyou, visit again\n");
    	    }
    	} catch(Exception e) {}   		
    }
    //Personal loan
	public void perloan() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		double loan;
		do 
		{
			System.out.append("Enter loan amount: ");
			String loanam = in.readLine();
			loan = Double.parseDouble(loanam);
			if(loan <=99)
			{
				System.out.println("Loan term must be greater than 99");
			}
		}while(loan <= 99);
		int term;
		do
		{
			System.out.println("Loan term in years: ");
			String termInYears = in.readLine();
			term = Integer.parseInt(termInYears);
			if(term <= 0)
			{
				System.out.println("Loan term must be atleast one year ");
			}
			else if(term > 50)
			{
				System.out.println("Loan term cannot excced 50 years");
			}
		}while(term <= 0 || term > 50);
		double rate;
		System.out.println("Interest rate per year: ");
		String annualRate = in.readLine();
		rate = Double.parseDouble(annualRate);
		if(rate < 0)
		{
			System.out.println("Interest cannot be negative");
		} while(rate < 0);
		rate = rate/(12*100);
		term = term*12;
		double monthlycost = (loan * rate * Math.pow(1+rate, term)) / (Math.pow(1+rate, term) - 1);
		System.out.println("The interest per month is: " +monthlycost );
		System.out.println("Your loan is approved");
		System.out.println("Thankyou, visit again\n");
	}
    //Car loan
	public void carloan() {
		double LAmount;
    	double rate;
    	double term;
    	double monthlycost;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Warning!!, Car loan will be given only for the persons above 18 years");
    	System.out.println("Enter your income : ");
        int	income = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
    	try{	
    	    if(income > 100000 && age > 18)
    	    { 
    	    	System.out.println("Enter the loan amount: ");
    	    	LAmount = sc.nextFloat();
    	    	System.out.println("Enter rate of loan: ");
    	    	rate = sc.nextFloat();
    	    	System.out.println("Enter term in years: ");
    	    	term = sc.nextFloat();
    	    	rate = rate / (12*100);
    	    	term = term *12;
    	    	monthlycost = (LAmount * rate * Math.pow(1 + rate, term))/ (Math.pow(1 + rate, term) - 1);
    	    	System.out.println("The monthly amount that you need to pay is : " +monthlycost);
    	    	System.out.println("Your Car loan is approved");
    	    	System.out.println("Thankyou, visit again\n");
    	    }
    	    else
    	    {
    	    	System.out.println("Sorry, our bank cannot give the loan");
    	    	System.out.println("Thankyou, visit again\n");
    	    }
    	} catch(Exception e) {}   		
    } 
	//House loan
	public void houseloan() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		double loan = console.nextDouble();
		System.out.println("Enter the term: ");
		int years = console.nextInt();
		System.out.println("Enter the interest rate: ");
		double rate = console.nextDouble();
		System.out.println();
		int n = 12 * years;
		double c = rate /(12.0 * 100.0);
		double payment = loan * c * Math.pow(1 + c, n) / (Math.pow(1 + c, n) - 1);
		System.out.println("The monthly payement is : " +(int) payment);
		System.out.append("Your House loan is approed");
		System.out.append("Thankyou, visit again\n");
	}
}
//Implementation
public class Bank_main {
	public static void main(String[] args) {
		String str;
		int choice = 0;
		BankWork option = new BankWork();
		do 
		{
			System.out.println("--------------- ABCD BANK --------------");
			System.out.println("========================================");
			System.out.println("Please take a look of choices");
			System.out.println(" 1) New Record Entry ");
			System.out.println(" 2) Display your record ");
			System.out.println(" 3) Education Loan ");
			System.out.println(" 4) Personal Loan ");
			System.out.println(" 5) Car Loan ");
			System.out.println(" 6) House Loan");
			System.out.println(" 7) Exit ");
			System.out.println("Please enter your choice: ");
			System.out.flush();
			try
			{
				 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	             str = obj.readLine();
	             choice = Integer.parseInt(str);
	             switch(choice)
	             {
	                 case 1: option.newEntry();
	                         break;
	                 case 2: option.display();
	                         break;
	                 case 3: option.eduloan();
	                         break;
	                 case 4: option.perloan();
	                         break;
	                 case 5: option.carloan();
	                         break;
	                 case 6: option.houseloan();
	                         break;
	                 case 7: System.out.println("\n -----Thankyou for visiting our bank :)----- \n");
	                         break;
	                 default:System.out.println("Sorry, Invalid choice, please try again -- Thankyou ");      
	             }
			}
			catch(Exception e) {}
		}while(choice != 7);	
	}
}