package com.company;

public class ShapFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapType){
        if (shapType == null){
            return null;
        }

        if (shapType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if (shapType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        if (shapType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
