
package keeptooapp;


public class KeepTooApp {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(() -> {
            new TransactionHistoryFrame().setVisible(true);
        });
    }
    
}
