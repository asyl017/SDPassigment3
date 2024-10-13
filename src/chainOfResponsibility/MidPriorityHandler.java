package chainOfResponsibility;

public class MidPriorityHandler extends BaseHandler {
    @Override
    public void handle(Task task) {
        if (task.getPriority() == 2) {
            handleMidPriority(task);
        } else {
            nextHandler.handle(task);
        }
    }

    private void handleMidPriority(Task task) {
        System.out.println("MId priority task has been handled");
    }
}
