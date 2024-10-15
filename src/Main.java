import chainOfResponsibility.*;
import command.*;
import mediator.Channel;
import mediator.ChannelMediator;
import mediator.Subscriber;

public class Main {

    public static void main(String[] args) {
        testChainOfResponsibility();
        testCommand();
        testMediator();
    }

    private static void testChainOfResponsibility() {
        Task firstPriorityTask = new Task(1, "authorization");
        Task secondPriorityTask = new Task(2, "authentication");
        Task thirdPriorityTask = new Task(3, "confirmation");
        Task wrong = new Task(4, "wrong");


        TaskHandler lowPriority = new LowPriorityHandler();
        TaskHandler midPriority = new MidPriorityHandler();
        TaskHandler highPriority = new HighPriorityHandler();
        TaskHandler noPriority = new EmptyHandler();

        lowPriority.setNextHandler(midPriority);
        midPriority.setNextHandler(highPriority);
        System.out.println("Task with first priority");
        highPriority.handle(firstPriorityTask);
        System.out.println("Task with second priority");
        midPriority.handle(secondPriorityTask);
        System.out.println("Task with third priority");
        lowPriority.handle(thirdPriorityTask);
        System.out.println("error");
        noPriority.handle(wrong);
    }


    private static void testCommand() {
        Game GTA = new Game();
        Music Mockingbird = new Music();
        Command startGame = new GameStartCommand(GTA);
        Command pauseGame = new GamePauseCommand(GTA);
        Command playMusic = new MusicStartCommand(Mockingbird);
        Command pauseMusic = new MusicPauseCommand(Mockingbird);
        Controller controller = new Controller();
        controller.setCommand(startGame);
        controller.PressButton();
        controller.setCommand(pauseGame);
        controller.PressButton();
        controller.setCommand(playMusic);
        controller.PressButton();
        controller.setCommand(pauseMusic);
        controller.PressButton();

    }

    private static void testMediator() {
        ChannelMediator mediator = new ChannelMediator();
        Channel channel = new Channel(mediator, "LifeHacks");

        Subscriber subscriber1 = new Subscriber("user1");
        Subscriber subscriber2 = new Subscriber("user2");

        channel.uploadVideo("Top 5 best life hacks");
        channel.uploadVideo("Top 5 best life hacks with batteries");

    }
}