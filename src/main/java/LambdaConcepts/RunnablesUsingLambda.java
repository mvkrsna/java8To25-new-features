package LambdaConcepts;

public class RunnablesUsingLambda {
    public static void main(String[] args) {
        /*
        * Before Java 8:
        * */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------->Runnable using Anonymous Class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        /*
        * From Java 8 onwards using Lambda Expressions:
        * */
        Runnable lambdaRunnable = () -> {
            System.out.println("-------------->Runnable using Lambda Expression");
        };
        new Thread(lambdaRunnable).start();


        // Even more concise
        new Thread(() -> { System.out.println("-------------->Runnable using Lambda Expression - More Concise"); })
                .start();
    }
}
