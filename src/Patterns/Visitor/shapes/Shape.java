package com.kurs2_1sem.OOAIP.zadanie10Visitor.shapes;

import com.kurs2_1sem.OOAIP.zadanie10Visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
