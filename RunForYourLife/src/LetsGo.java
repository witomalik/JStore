import static java.lang.Math.random;

public class LetsGo {

    private static double wLionel = 1;
    private static double wMessi = 0.7;
    private static double wAndres = 0.4;

    public static int getRandom(){
        //Random Number Between 100-500
        return (int)(Math.random() * ((5000 - 100) + 1)) + 100;
    }

    public static void main(String[] args) {
        //Lionel < Andres < Messi

        RunForYourLife lionel = new RunForYourLife("Lionel", wLionel);
        RunForYourLife andres = new RunForYourLife("Andres", wAndres);
        RunForYourLife messi = new RunForYourLife("Messi", wMessi);

        lionel.start();
        andres.start();
        messi.start();
    }
}
