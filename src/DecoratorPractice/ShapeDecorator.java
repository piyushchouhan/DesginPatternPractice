package DecoratorPractice;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratShape){
        this.decoratedShape = decoratShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}