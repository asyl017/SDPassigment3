package command;

public class MusicPauseCommand implements Command {
    private Music song;

    public MusicPauseCommand(Music song) {
        this.song = song;
    }

    @Override
    public void execute() {
        song.pause();
    }
}
