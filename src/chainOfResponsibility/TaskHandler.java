package chainOfResponsibility;

public interface TaskHandler {
    void setNextHandler(TaskHandler nextHandler);
    String handle(Task task);
}
