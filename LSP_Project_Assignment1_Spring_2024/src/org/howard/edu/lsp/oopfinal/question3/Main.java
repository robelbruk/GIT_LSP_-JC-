package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        Shape c = ShapeFactory.getShape("CIRCLE");
        c.draw();
        Shape r = ShapeFactory.getShape("RECTANGLE");
        r.draw();
    }
}

