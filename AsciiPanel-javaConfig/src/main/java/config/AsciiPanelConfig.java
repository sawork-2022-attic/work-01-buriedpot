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
    public AsciiPanel asciiPanel(@Value("80") int width, @Value("24")int height) {
        return new AsciiPanel(width, height, asciiFont_CP437_9x16());
    }



    @Bean
    public AsciiFont asciiFont_CP437_8x8() {
        return AsciiFont.CP437_8x8;
    }
    @Bean
    public AsciiFont asciiFont_CP437_10x10() {
        return AsciiFont.CP437_10x10;
    }
    @Bean
    public AsciiFont asciiFont_CP437_12x12() {
        return AsciiFont.CP437_12x12;
    }
    @Bean
    public AsciiFont asciiFont_CP437_16x16() {
        return AsciiFont.CP437_16x16;
    }

    @Bean
    public AsciiFont asciiFont_CP437_9x16() {
        return AsciiFont.CP437_9x16;
    }
    @Bean
    public AsciiFont asciiFont_DRAKE_10x10() {
        return AsciiFont.DRAKE_10x10;
    }
    @Bean
    public AsciiFont asciiFont_TAFFER_10x10() {
        return AsciiFont.TAFFER_10x10;
    }
    @Bean
    public AsciiFont asciiFont_QBICFEET_10x10() {
        return AsciiFont.QBICFEET_10x10;
    }
    @Bean
    public AsciiFont asciiFont_TALRYTH_15_15() {
        return AsciiFont.TALRYTH_15_15;
    }


}
