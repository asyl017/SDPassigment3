package chainOfResponsibility;

public abstract class BaseHandler implements TaskHandler {
    protected TaskHandler nextHandler;

    @Override
    public void setNextHandler(TaskHandler handler) {
        nextHandler = new EmptyHandler();
    }

    public BaseHandler() {
        nextHandler = new EmptyHandler();
    }
}
