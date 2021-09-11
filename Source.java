import java.awt.*;
import javax.swing.*;

public class Source extends JFrame {

  public Source() {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (((int)screenSize.getWidth())/5)*3;
    int height = (width/5)*4;//screen size
    ImageIcon icon = new ImageIcon("res/icon.png");
    setIconImage(icon.getImage());
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//closes all the threads
    JMenuBar mb = new JMenuBar();//makes the menu bar
    JMenu file = new JMenu("File");//is the individual thing on the menu bar
    mb.add(file);//adds the individual thing to the menu bar
    //JMenu file submenu = new JMenu("A submenu")
    JMenu help = new JMenu("Help");
    mb.add(help);
    setJMenuBar(mb);//adds the jmenue bar to the window
    setSize (width, height);//window
    setVisible(true);//window
    setTitle("First GUI");//window

    file.addSeparator();
    //JMenu subfOpen = new JMenu ("Open");
    JMenuItem subfOpen = new JMenuItem("Open");
    file.add(subfOpen);
    JMenuItem subfsave = new JMenuItem("Save");
    file.add(subfsave);
    //JMenu file submenu = new JMenu("A submenu")
  }


  public static void main (String args[]) {
    Source gui = new Source();
  }
}
