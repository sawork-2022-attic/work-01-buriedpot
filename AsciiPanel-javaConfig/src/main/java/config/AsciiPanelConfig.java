package config;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AsciiPanelConfig {


    @Bean
    @Scope("prototype")
    public AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont();
    }

    @Bean
    public int width() {
        return 9;
    }

    @Bean int height() {
        return 16;
    }
    @Bean String fontFilename() {
        return "cp437_9x16.png";
    }




}
