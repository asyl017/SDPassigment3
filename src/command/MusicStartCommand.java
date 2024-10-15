package command;

public class MusicStartCommand implements Command {
    private Music song;

    public MusicStartCommand(Music song) {
        this.song = song;
    }

    @Override
    public void execute() {
        song.start();
    }
}
