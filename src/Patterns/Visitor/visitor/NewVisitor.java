package com.kurs2_1sem.OOAIP.zadanie10Visitor.visitor;

import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.*;

public class NewVisitor implements Visitor{


    public String show(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "Visiting dot..";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "Visiting circle..";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "Visiting rectangle..";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "Visiting compound graphic..";
    }
}
