package com.kurs2_1sem.OOAIP.zadanie10Visitor.visitor;

import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.*;

public class test {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
        show(rectangle, compoundShape);


}

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

    private static void show(Shape... shapes) {
        NewVisitor newVisitor = new NewVisitor();
        System.out.println(newVisitor.show(shapes));
    }

}
