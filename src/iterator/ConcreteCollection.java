package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {
    private List<Object> items = new ArrayList<>();

    public void add(Object item) {
        items.add(item);
    }

    public Object get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

}
