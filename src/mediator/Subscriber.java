package mediator;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void showNotifications(Channel channel, String notification) {
        System.out.println(channel.getName() + "uploaded a new video:"+ notification);
    }
}
