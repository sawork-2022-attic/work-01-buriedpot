package rltut;

import asciiPanel.AsciiPanel;
import config.AsciiPanelConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class ApplicationMain extends JFrame {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;

    public ApplicationMain(){
        super();
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);


        terminal = (AsciiPanel) app.getBean("asciiPanel");
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