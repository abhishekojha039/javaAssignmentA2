import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    public int addCandies(int candies)
    {
		return candies;
		
    }

	@Override
	public int getCost() {
	return 0;
	}
}
class Cookie extends DesertItem {
    public int addCookies(int candies)
    {
		return candies;
		
    }

	@Override
	public int getCost() {
		return 0;
	}
}
class IceCream extends DesertItem {
    public int addIceCreams(int candies)
    {
		return candies;
		
    }

	@Override
	public int getCost() {
		return 0;
	}
}
public class Assignment2Q7 {
    private void selectRoles(){
    	System.out.println("Press 1 for owner");
    	System.out.println("Press 2 for customer");
    }
    private void roles(String role){}
    private void addItems() {
    	
    }
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}
    
    public static void main(String[] args)
    {
      Assignment2Q7 a1=new Assignment2Q7();
      Candy c1=new Candy();
      IceCream i1=new IceCream();
      Cookie ck1=new Cookie();
      Scanner sc=new Scanner(System.in);
      
      a1.selectRoles();
      int role=sc.nextInt();
      if(role==1)
      {
    	  System.out.println("ADD Items");
    	  String extraItems=sc.next();
      }
      else if(role==2)
      {
    	  System.out.println("Quantity of Candies");
    	  c1.addCandies(sc.nextInt());
    	  
      }
      
      else
      {
    	  System.out.println("Wrong input");
    	  
      }
      
    }

}