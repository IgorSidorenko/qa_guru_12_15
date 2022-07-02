package io.sidorenko.owner.helpers;

import org.aeonbits.owner.ConfigFactory;
import io.sidorenko.owner.config.ApiConfig;

public class ApiConfigProvider {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
}
