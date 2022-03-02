package rltut;

import asciiPanel.AsciiFont;
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
        //terminal.setAsciiFont(AsciiFont.DRAKE_10x10);
        terminal.write("rl tutorial", 1, 1);
        add(terminal);
        pack();
        System.out.println(terminal.getAsciiFont().getFontFilename() + "," + terminal.getAsciiFont().getWidth() + "," +
                terminal.getAsciiFont().getHeight());
    }

    public static void main(String[] args) {
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}
