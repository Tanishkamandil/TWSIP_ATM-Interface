import java.util.Scanner;
public class AtmInterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Balance = 0;
        int withdraw ;
        int Deposit;
        System.out.println("Balance = 0");

        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
          
          
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
         
        withdraw = sc.nextInt();  
                      
         
        if(Balance >= withdraw)  
        {  
             
            Balance = Balance - withdraw;  
            System.out.println("Please collect your money!!\n");  
            System.out.println(" Your Current Balance: " +  Balance );
            System.out.println("");  
        }  
        else 
        {  
             
            System.out.println("Insufficient Balance");  
            System.out.println(""); 
        }  
         
        break;  
   
                case 2:  
                      
        System.out.println("Enter money to be deposited:");  
                      
        
        Deposit = sc.nextInt();  
                      
        
        Balance = Balance + Deposit;  
        System.out.println("Your Money has been successfully deposited!!");  
        System.out.println("");  
        break;  
   
                case 3:  
         
        System.out.println("Balance : " +  Balance);  
        System.out.println("");  
        break;  
   
                case 4:  
       
        System.exit(0);  
            }  
        }       
    }
}