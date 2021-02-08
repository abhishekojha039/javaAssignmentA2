import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return incentive+salary;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return overtime+salary;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary)
    {
       return salary;	
       
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int sum=0;
    	for(Integer s:employeeSalaries)
    	{
    		sum=sum+s;
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	Assignment2Q2 a1=new Assignment2Q2();
    	Labour l1=new Labour();
    	Manager m1=new Manager();
    	ArrayList <Integer> arr1=new ArrayList<Integer>();
    	arr1.add(a1.getSalary(a1.salary));
    	arr1.add(l1.getSalary(a1.salary));
    	arr1.add(m1.getSalary(a1.salary));
    	System.out.println("Total Salary = "+a1.totalEmployeesSalary(arr1));
    }
}