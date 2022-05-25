import javax.swing.*;

public class Main {
    public static void main(String [] a){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new s();
            }
        });
    }
}
