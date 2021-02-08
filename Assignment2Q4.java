abstract class Food{    
abstract String varieties();    
}    
class Veg extends Food{    
  String  varieties(){ 
	  return "Vegetables,Fruits, Seeds etc";
	  }    
}    
class Nonveg extends Food{    
	String  varieties(){ 
		  return "Every type of meat";
		  } 
	}    
    
class Assignment2Q4{    
public static void main(String args[]){    
Food b;  
b=new Veg();  
System.out.println(b.varieties());    
b=new Nonveg();  
System.out.println(b.varieties());    
}}
