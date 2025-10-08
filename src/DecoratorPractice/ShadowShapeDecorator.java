package DecoratorPractice;

public class ShadowShapeDecorator extends ShapeDecorator {

    public ShadowShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        addShadow(decoratedShape);
    }

    private void addShadow(Shape decoratedShape) {
        System.out.println("Added Shadow Effect");
    }
}
