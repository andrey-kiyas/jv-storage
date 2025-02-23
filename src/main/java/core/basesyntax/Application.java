package core.basesyntax;

import core.basesyntax.impl.StorageImpl;

public class Application {
    public static void main(String[] args) {
        Storage<Integer, Box> storage = new StorageImpl<>();
        Box box = new Box();
        storage.put(22, box);
        Box value = storage.get(22); // returns the Box
        int size = storage.size(); // returns storage size

        System.out.println(value);
        System.out.println(size);
    }
}
