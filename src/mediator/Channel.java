package mediator;

public  class Channel {
    protected Mediator mediator;
    protected String name;

    public Channel(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void uploadVideo(String videoTitle){
        System.out.println(name + " uploaded a new video: " + videoTitle);
        mediator.notify(this,videoTitle);
    }

    public String getName() {
        return name;
    }

}
