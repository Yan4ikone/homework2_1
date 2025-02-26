package helpers;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/main/resources/config.properties"})

public interface ConfigProperties extends Config {
    @Config.Key("base.url")
    String baseUrl();

    @Config.Key("name.product")
    String nameProduct();

    @Config.Key("name.phone")
    String namePhone();

    @Config.Key("time.out")
    Integer timeOut();
}
