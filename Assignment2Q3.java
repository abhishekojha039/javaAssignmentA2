import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	
		return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
      return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int sum=0;
    	
    	for(Integer s:cash)
    	{
    		sum=sum+s;
    	}
    	return sum;
    }
    public int getCash(){return 0;}
    public static void main(String[] args) {
    	SavingsAccount s1=new SavingsAccount();
    	CurrentAccount c1=new CurrentAccount();
    	Assignment2Q3 t1=new Assignment2Q3();
    	ArrayList <Integer> arr=new ArrayList<Integer>();
    	arr.add(s1.getCash());
    	arr.add(c1.getCash());
    	System.out.println("Total Amount In Bank = "+t1.totalCashInBank(arr));
    	
    }
}