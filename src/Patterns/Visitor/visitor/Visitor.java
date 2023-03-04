package com.kurs2_1sem.OOAIP.zadanie10Visitor.visitor;

import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.Circle;
import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.CompoundShape;
import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.Dot;
import com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes.Rectangle;

public interface Visitor {
    String  visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
