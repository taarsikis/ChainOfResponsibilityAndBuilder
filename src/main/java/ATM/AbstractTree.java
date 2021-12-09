package ATM;

public class AbstractTree implements Tray{
    private int bill;
    private  Tray nextTray;

    public AbstractTree(int bill){
        this.bill = bill;
    }

    public void process (int amount){
        System.out.println("Process in Tray" + this.bill +"Amount: " + amount );
    }

    public void setNext(Tray tray){
        this.nextTray = tray;
    }
}
