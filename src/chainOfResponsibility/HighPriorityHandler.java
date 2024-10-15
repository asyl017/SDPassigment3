package chainOfResponsibility;

public class HighPriorityHandler extends BaseHandler {

    @Override
    public void handle(Task task) {
        if (task.getPriority() == 1) {
            handleHighPriority(task);
        } else {
            nextHandler.handle(task);
        }
    }

    private void handleHighPriority(Task task) {
        System.out.println("High priority task has been handled");
    }
}
