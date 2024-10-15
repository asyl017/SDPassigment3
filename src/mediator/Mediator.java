package mediator;

public interface Mediator {
    void register(Subscriber subscriber);
    void notify(Channel channel, String notification);
}
