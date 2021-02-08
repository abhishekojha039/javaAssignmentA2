class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle class";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line Class";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube class";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	 Shape5 s1=new Rectangle5();
    	    System.out.println(s1.draw());
    	 s1=new Line5();
    	    System.out.println(s1.draw());
    	 s1=new Cube5();
    	    System.out.println(s1.draw());
    }
    
   
    
}
