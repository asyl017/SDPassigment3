package chainOfResponsibility;

public class LowPriorityHandler extends BaseHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() == 3) {
            handleLowPriority(task);
        } else {
            nextHandler.handle(task);
        }
    }

    private void handleLowPriority(Task task) {
        System.out.println("Low priority task has been handled");
    }
}
