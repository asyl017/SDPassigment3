package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChannelMediator implements Mediator {

    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void notify(Channel channel, String notification) {
        for (Subscriber subscriber : subscribers) {
            subscriber.showNotifications(channel, notification);
        }
    }
}
