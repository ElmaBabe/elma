class Subtraction {
    //Define atrributes (double variables)
    double b;
    double e;

    //Define methods
    double subtraction() {
        return b - e;
    }
}


public class Work {
    public static void main(String[] args){
        //Create objects of the class
        Subtraction o= new Subtraction();

        //Set values for attributes
        o.b= 9.78;
        o.e= 4.52;

        //Call the subtraction method on objects
        double result= o.subtraction();

        //Print the result
        System.out.println(result);
    }
}