package shape;

class Shape2 {
    String shapeName;
    double radius;
    double length;
    double width;
    double side1;
    double side2;
    double side3;

    Shape2(String shapeName, double r){
        this.radius=r;
        this.shapeName=shapeName;
    }
    Shape2(String shapeName, double len,double wid){
        this.shapeName = shapeName;
        this.length = len;
        this.width = wid;
    }
    Shape2(String shapeName, double s1, double s2, double s3){
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
    	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
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
