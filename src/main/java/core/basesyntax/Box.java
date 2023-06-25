package core.basesyntax;

public class Box<T> {
    private T value;

    public Box(){
    }

    public T getValue() {
        return value;
    }

    public Box setValue(T value) {
        this.value = value;
        return this;
    }
}
