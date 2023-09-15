class MyClass {
  // Define attributes (instance variables)
  int m;
  int n;

  
  // Define  methods
  int add() {
       return m + n ;
  }
  

}


public class Mini {
    public static void main(String[] args) {
        // Create objects of the class
        MyClass s = new MyClass();
        // MyClass object2 = new MyClass();

        // Set values for attributes
        s.m = 5;
        s.n = 3;

        // object2.attribute1 = 10;
        // object2.attribute2 = 7;

        // Call the add method on objects
        int result = s.add();
        //int result2 = object2.add();

        // Print the results
        System.out.println(result);
        //System.out.println("Result2: " + result2);
    }
}