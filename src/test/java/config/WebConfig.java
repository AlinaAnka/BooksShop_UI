package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:web.properties")
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("email")
    String email();

    @Key("password")
    String password();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("baseUrl")
    String baseUrl();

}
