package com.example.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"file:config.properties"})
public interface ConfigProp extends Config {

    @Key("url_test")
    String url();
}
