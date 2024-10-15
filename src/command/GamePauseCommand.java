package command;

public class GamePauseCommand implements Command {
    private Game game;

    public GamePauseCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.pause();
    }
}
