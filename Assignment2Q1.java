
class Singleton 
{ 
   
    private static Singleton single_instance = null; 
    public String s; 
    private Singleton() 
    { 
        s = "Singleton class Assignmnet"; 
    } 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
        {
            single_instance = new Singleton(); 
        }
  
        return single_instance; 
    } 
} 
  
// Driver Class 
class Assignment2Q1
{ 
    public static void main(String args[]) 
    { 
        Singleton x = Singleton.getInstance(); 
  
        Singleton y = Singleton.getInstance(); 
  
         x.s=x.s+"checking for single Instance";
        System.out.println( x.s); 
        System.out.println( y.s); 
       
    } 
}
