package iterator;

public class ConcreteIterator implements Iterator{
    private ConcreteCollection item;
    private int currentIndex = 0;

    public ConcreteIterator(ConcreteCollection item) {
        this.item = item;
    }

    public boolean hasNext() {
        return currentIndex < item.size();
    }

    public Object next() {
        return item.get(currentIndex++);
    }
}
