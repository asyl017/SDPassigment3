package chainOfResponsibility;

public class HighPriorityTask implements TaskHandler {
    private TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public String handle(Task task) {
        if (task.getPriority() == 3) {
            System.out.println("HighPriorityTask: Handling low priority task.");
        } else if (nextHandler != null) {
            nextHandler.handle(task);
        }
        return "No handler was found for this task" + task.getName();
    }
}
