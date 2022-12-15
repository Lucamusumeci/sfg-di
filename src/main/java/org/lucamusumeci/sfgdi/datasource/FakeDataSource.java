package org.lucamusumeci.sfgdi.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//This class it to test external properties
@PropertySource("classpath:datasourcetest.properties")
@Component
public class FakeDataSource {

    private final String username;
    private final String password;

    //@Autowired
    public FakeDataSource(@Value("${datasourcetest.username}") String username,
                          @Value("${datasourcetest.password}") String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
