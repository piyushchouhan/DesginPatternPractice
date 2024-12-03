package FactoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return  null;
        }

        switch (shapeType.toUpperCase()){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
