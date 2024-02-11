import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt extends Frame {
    private Label label;
    private Label label2;
    private Button button;

    public awt() {

        label = new Label("Atharva");
        button = new Button("Click me");
        label2 = new Label("Fuck");

        add(label);
        add(button);
        add(label2);


        setTitle("AWT Example");
        setSize(300,200);
        setLayout(new FlowLayout());
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked");
            }
        });


    }
}