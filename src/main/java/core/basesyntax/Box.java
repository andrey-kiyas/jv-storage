package core.basesyntax;

public class Box {
    private Object value;

    public Box(){
    }

    public Object getValue() {
        return value;
    }

    public Box setValue(Object value) {
        this.value = value;
        return this;
    }
}
