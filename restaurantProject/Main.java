package restaurantProject;
import java.util.Scanner;
public class Main{
	public static Scanner input = new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double  total=0,Pay;
	public static void menu() {
		System.out.println("-'-'-'-'-'-'-'-'-'-'-'-'-'-'-");
		System.out.println("\t Welcome to our Restaurant");
		System.out.println("\t Restaurant Menu");
		System.out.println("\t 1.Barger BDT $80.00");
		System.out.println("\t 2.Pizza BDT $100.00");
		System.out.println("\t 3.Coffee BDT $60.00");
		System.out.println("\t 4.Cancel ");
		
	}
	public static void order() {
		System.out.println("1 to Barger || 2 to Pizza || 3 to coffee");
		System.out.println("Press you want to order: ");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("you choice barger");
			System.out.println("how many barger you to want  :");
			Quantity=input.nextInt();
			total= total+(Quantity*80);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes] and N for[No]:   ");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:  ");
				Pay=input.nextDouble();
				if(Pay<total)
					System.out.println("Amount not Sufficient");
				else if(Pay>total){
					System.out.println("total=" +total+"Rs");
					double Return = Pay-total;
					System.out.println("Customers return: "+Return+"Rs");
				}
					
			}
			
		}
	
		
		if(choice==2) {
			System.out.println("you choice Pizza");
			System.out.println("how many Pizza you to want  :");
			Quantity=input.nextInt();
			total= total+(Quantity*100);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes] and  for[No]:   ");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:  ");
				Pay=input.nextDouble();
				if(Pay<total)
					System.out.println("Amount not Sufficient");
				else if(Pay>total){
					System.out.println("total=" +total+"Rs");
					double Return = Pay-total;
					System.out.println("Customers return: "+Return+"Rs");
				}
					
			}
			
		}
		if(choice==3) {
			System.out.println("you choice Coffee");
			System.out.println("how many Coffeeyou to want  :");
			Quantity=input.nextInt();
			total= total+(Quantity*60);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes] and  for[No]:   ");
			again=input.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:  ");
				Pay=input.nextDouble();
				if(Pay<total)
					System.out.println("Amount not Sufficient");
				else if(Pay>total){
					System.out.println("total=" +total+"Rs");
					double Return = Pay-total;
					System.out.println("Customers return: "+Return+"Rs");
				}
					
			}
			
		}
		else if(choice==4) {
			System.exit(0);
			
		}
		else {
			System.out.println("Choose a Food  is this item: ");
			order();
		}
	}


	public static void main(String args[]){
		menu();
		order();
	}

}
