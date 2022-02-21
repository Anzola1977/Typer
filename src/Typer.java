public class Typer extends Thread {

    String message;

    public Typer(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
