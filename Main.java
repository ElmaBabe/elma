class Multiply {
    //Define attributes (instance variables
    int b;
    int g;

    //Define methods
    int multiply() {
        return b * g;
    }
}

public class Main {
    public static void main(String[] args){
        //Create objects of the class
        Multiply t= new Multiply();

        //Set values for attributes
        t.b= 8;
        t.g= 9;

        //Call the multiply method on objects
        int result= t.multiply();

        //Print the result
        System.out.println(result);
    }
}