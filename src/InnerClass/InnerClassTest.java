package InnerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        System.exit(0);
    }
}

class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep){
        this.beep = beep;
        this.interval = interval;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval,listener);
        t.start();
    }
    public class TimePrinter implements ActionListener{

        public void actionPerformed(ActionEvent event){
            Date now = new Date();
            System.out.println("Kiedy usłyszysz dźwięk, będzie godzina: "+now);
            if(beep) Toolkit.getDefaultToolkit().beep();
        }

    }
}