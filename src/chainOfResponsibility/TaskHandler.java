package chainOfResponsibility;

public interface TaskHandler {
    void setNextHandler(TaskHandler nextHandler);
    void handle(Task task);
}
