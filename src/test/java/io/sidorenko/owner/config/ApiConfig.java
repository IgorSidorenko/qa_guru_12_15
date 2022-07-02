package io.sidorenko.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties",
        "classpath:config/auth.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://github.com")
    String baseUrl();

    @Key("token")
    @DefaultValue("any_token")
    String token();
}