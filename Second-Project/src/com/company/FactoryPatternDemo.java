//Based on https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
/**
 * Author: Dinh
 * Goal: Implement factory pattern
 */
package com.company;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapFactory shapFactory = new ShapFactory();

        //get an object of Circle and call its draw method.
        Shape shape = shapFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape.draw();

        Shape secondshape = shapFactory.getShape("RECTANGLE");
        secondshape.draw();

        Shape thirdshape = shapFactory.getShape("SQUARE");
        thirdshape.draw();

    }

}
