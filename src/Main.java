public class Main {

    public static void main(String[] args) {

        Typer typer = new Typer("Message first. ");
        Typer typer1 = new Typer("Message second.");
        typer.start();
        try {
            typer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        typer1.start();
        try {
            typer1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
