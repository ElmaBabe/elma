class  Circle {
    // Define attributes (double variables)
    double area = 75;
    double pi = 3.14;
    double radius;
    double sq;
    
    // Define methods
    double rad() {
        sq = area/pi;
        radius = Math.sqrt(sq);
        return radius;


    }
      
        public static void main(String[] args) {
            Circle circle = new Circle();

            double result = circle.rad();
            System.out.println(result);
        }
    }

