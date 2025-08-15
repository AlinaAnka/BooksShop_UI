package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:web.properties")
public interface WebConfig extends Config {

    String browser();
    String browserVersion();
    String browserSize();
    String email();
    String password();
    String baseUrl();
}
