package rltut;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain extends JFrame {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;

    public ApplicationMain(){
        super();
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");


        terminal = (AsciiPanel) app.getBean("AsciiPanel", 200, 24, null);
        terminal.write("rl tutorial", 1, 1);
        add(terminal);
        pack();
    }

    public static void main(String[] args) {
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}