import java.awt.*;

public class MyMenu extends Frame {
    public MyMenu() {
        // Create menu components
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");

        // Set frame properties
        setTitle("Menu Example");
        setSize(400, 300);

        // Add menu components to the frame
        setMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(menuItem);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyMenu();
    }
}
