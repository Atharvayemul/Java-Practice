import java.awt.*;

public class MyDialog extends Frame {
    public MyDialog() {
        // Create a dialog with the parent frame
        Dialog dialog = new Dialog(this, "My Dialog", true);

        // Set dialog properties
        dialog.setSize(300, 200);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new MyDialog();
    }
}
