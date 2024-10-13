import chainOfResponsibility.*;

public class Main {

    public static void main(String[] args) {
        Task firstPriorityTask = new Task(1,"authorization");
        Task secondPriorityTask = new Task(2,"authentication");
        Task thirdPriorityTask = new Task(3,"confirmation");
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

    private void testChainOfResponsibility() {

    }


    private void testIterator() {


    }
}