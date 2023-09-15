class Radius {
    // Define attributes (double variables)
    double area = 90;
    double pi = 3.14;
    double radius;
    double sq;

    // Define methods
    double rad() {
        sq = area/pi;
        radius = Math.sqrt(sq);
        return radius;

    }


}

public class MyProject {
    public static void main(String[] args) {
        // Create objects of the class 
        Radius radius = new Radius();

        
        double result = radius.rad();
        System.out.println(result);

        
    }
    
}