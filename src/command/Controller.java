package command;

public class Controller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void PressButton(){
        command.execute();
    }
}
