package chainOfResponsibility;

public class Task {
    private int priority;
    private String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }


    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }
}
