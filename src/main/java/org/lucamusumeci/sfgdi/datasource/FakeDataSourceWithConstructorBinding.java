package org.lucamusumeci.sfgdi.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConstructorBinding   //Removed in Spring Boot 3
@ConfigurationProperties("datasourcetest")
public class FakeDataSourceWithConstructorBinding {
    private final String username;
    private final String password;

    public FakeDataSourceWithConstructorBinding(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "FakeDataSourceWithConstructorBinding{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
