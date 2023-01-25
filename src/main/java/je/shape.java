package je;


import java.util.*; 
import java.lang.Math;
class shape2 {
    String shapeName;
    double radius;
    double length;
    double width;
    double side1;
    double side2;
    double side3;

    shape2(String shapeName, double r){
        this.radius=r;
        this.shapeName=shapeName;
    }
    shape2(String shapeName, double len,double wid){
        this.shapeName = shapeName;
        this.length = len;
        this.width = wid;
    }
    shape2(String shapeName, double s1, double s2, double s3){
        this.shapeName = shapeName;
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    double area(double radius) {
    	return radius*radius*3.14;
    }
    double area(double length,double width) {
    	return length*width;
    }
    double area(double side1, double side2,double side3) {
    	double s = perimeter(side1,side2,side3)/2;
    	double a= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    	return a;
    }

    double perimeter(double radius) {
    	return 2*3.14*radius;
    }
    double perimeter(double length,double width) {
    	return 2*(length+width);
    }
    double perimeter(double side1, double side2,double side3) {
    	return side1+side2+side3;
    }   
}
class shape{
    public static void main(String[] args) {
        int choice;
        String shapeName;
        double r,len,wid,s1,s2,s3;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter Radius:");
                    r = sc.nextDouble();
                    shapeName = "Circle";
                    shape2 sh = new shape2(shapeName, r);
                    System.out.println("Area of Circle: "+sh.area(r));
                  System.out.println("Perimeter of Circle: "+sh.perimeter(r));

                }break;
                case 2:{
                	System.out.println("Enter Length and Width:");
                	len = sc.nextDouble();
                	wid = sc.nextDouble();
                	shapeName = "Rectangle";
                	shape2 sh = new shape2(shapeName, len,wid);
                	System.out.println("Area of Rectangle: "+sh.area(len, wid));
                	System.out.println("Perimeter of Rectangle: "+sh.perimeter(len, wid));

                }break;
                case 3:{
                	System.out.println("Enter Three sides of the triangle:");
                	s1 = sc.nextDouble();
                	s2 = sc.nextDouble();
                	s3 = sc.nextDouble();
                	shapeName = "Triangle";
                	shape2 sh = new shape2(shapeName,s1,s2,s3);
                	System.out.println("Area of Triangle: "+sh.area(s1,s2,s3));
                	System.out.println("Perimeter of Triangle: "+sh.perimeter(s1,s2,s3));
                	
                }break;
                case 4: System.exit(0);
            
                default:System.out.println("***Enter right choice***");
                    break;
                   
            }
            
        }
    }
}
