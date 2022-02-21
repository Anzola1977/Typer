public class Main {

    public static void main(String[] args) {

        Typer typer = new Typer("Message first. ");
        Typer typer1 = new Typer("Message second.");
        typer.start();
        typer1.start();
        try {
            typer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
