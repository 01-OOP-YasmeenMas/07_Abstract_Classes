package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0 );

        rectangle.area();
        circle.area();
        triangle.area();

        output("------ Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());


        output("------  Differenzen ------");
        output("Diff. r-t: " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(rectangle, circle));
        output("Diff. c-r: " + areaDiff(circle,rectangle));
       
    }


        
    // 1.Iteration:  ggf. 1000x überladen ... 
    // private static double areaDiff(Circle c, Rectangle r) {
    //     return c.area() - r.area();
    // }

    private static double areaDiff(Circle c, Rectangle r) {
        return c.area() - r.area();
    }

    private static double areaDiff(Rectangle r, Triangle t) {
        return r.area() - t.area();
    }

    private static double areaDiff(Rectangle r, Circle c) {
        return r.area() - c.area();  
    }





    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

