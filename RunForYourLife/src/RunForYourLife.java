public class RunForYourLife implements Runnable {
    private Thread t;
    private String name;
    private String threadName;
    private int checkpoint;
    private double weight;

    public RunForYourLife(String name1, double weight1) {
        setName(name1);
        this.threadName=getName()+"Thread";
        this.weight=weight1;
        setCheckpoint(1);
    }

    public String getName(){
        return name;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setName(String name){
        this.name=name;
    }

    public int setCheckpoint(int checkpoint){
        this.checkpoint=checkpoint;
        return checkpoint;
    }

    public void start() {
        if (t == null) {
            //Creating the Thread
            t = new Thread(this, threadName);
            System.out.println(name + ", read.!");
            //Starting the Thread
            System.out.println(name + ", set...");
            t.start();
        }
    }

    public void run(){
        System.out.println(name + ", go!");
        while(getCheckpoint() != 20){
            int randNumber = (int) Math.round(LetsGo.getRandom()*weight);
            try {
                Thread.sleep(randNumber);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
            System.out.println(name + " has passed checkpoint " +  checkpoint);
            checkpoint++;
        }
        System.out.println(name + " has finished!");
    }
}
