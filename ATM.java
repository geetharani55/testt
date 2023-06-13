package array_2d;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] kk)
	{
         long  ser_card_num=12345, output_card_num;
		 int ser_pin_num=2222,output_pin_num,balance=5000,withdraw,deposite,mini_statement,balance_enquiry,exit,yes,no,n,amount;
		 Scanner x=new Scanner(System.in);
		 System.out.println("ent ser_card_num");
		 output_card_num=x.nextLong();
		 System.out.println("ent ser_pin_num");
		 output_pin_num=x.nextInt();
		 if(ser_card_num == output_card_num && ser_pin_num ==output_pin_num)
		   { 
			 System.out.println("\twelcome");
	            for(n=1; n<=5; n++)
	           {
			     System.out.println("\t1.withdraw \n \t 2.deposite  \n \t 3.mini_statement \n \t 4.balance_enquiry \n  \t 5.exit \t \n");
			    System.out.println("select any option");
			    n=x.nextInt();
			    if(n==1)
			      {
				    System.out.println("ent how much amount ");
				    amount=x.nextInt();
				    System.out.println("succesfully compleated withdraw \n do you want to display the balance \n yes=1/no=2");
				    yes=x.nextInt();
				     if(yes==1)
				       {
				    	   balance=balance-amount;
				    	   System.out.println("the balance in your account is "+balance+"\n");
				    	 }
				         else
				           {
				        	  System.out.println("Thank you \n"+"exit \n");  
				         }
			    }   	 
			    else if(n==2)
			         {  
			    	    System.out.println("ent how much amount ");
				        amount=x.nextInt();
				        System.out.println("succesfully compleated deposite \n"+"do you want to display the balance \n"+"yes=1/no=2");
				         yes=x.nextInt();
				         if(yes==1)
				           {
				    	     balance=balance+amount;
				    	      System.out.println("the balance in your account is "+balance+"\n");
				    	   }
				          else
				          {
				        	    System.out.println("Thank you \n"+"exit \n");  
				               }
			             }    	 
			            else if(n==3)
			                  {
			            	       System.out.println("\t\t date \t\t type of trasection \t\t amount \t\t \n "+" \t\t 12/10/2020  \t\t online \t\t\t1000 \t\t \n");
			                  }
			                   else if(n==4)
			                           {
			            	             System.out.println("the balnce in your account is "+balance);
			                           }
			                           else
			                           {
			                        	   System.out.println("Exit \n");
			                           }
		                    }
		   }
		               
		                   else
			                   {
			                	   System.out.println("you have entered wrong card and pin number please try again \n"+"thank you");
			                   }
		   
	}

}
