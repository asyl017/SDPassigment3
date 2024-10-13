package chainOfResponsibility;

public class EmptyHandler implements TaskHandler {

    @Override
    public void setNextHandler(TaskHandler nextHandler) {

    }

    @Override
    public void handle(Task task) {
        System.out.println("Sorry,handlers are ended!");
    }
}
