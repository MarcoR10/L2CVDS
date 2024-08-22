package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.concrete.*;

public class ShapeFactory {

    public static Shape create(RegularShapeType type){
        Shape shape = null;
        switch (type){
            case Hexagon:
                shape = new Hexagon();
                return shape;
            case Pentagon:
                shape = new Pentagon();
                return shape;
            case Quadrilateral:
                shape = new Quadrilateral();
                return shape;
            case Triangle:
                shape = new Triangle();
                return shape;
            default:
                return shape;
        }
    }
}
