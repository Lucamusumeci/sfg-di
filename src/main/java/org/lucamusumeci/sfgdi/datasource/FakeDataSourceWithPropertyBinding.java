package org.lucamusumeci.sfgdi.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties("datasourcetest")
@Configuration
@Component
public class FakeDataSourceWithPropertyBinding {
    private String username;    //not final. It's going to be assigned to property datasourcetest.username
    private String password;    //not final. It's going to be assigned to property datasourcetest.password

    //This DOES NOT USE Constructor binding, because it's using property binding.
    /*
    public FakeDataSourceWithPropertyBinding(String username, String password) {
        this.username = username;
        this.password = password;
    }
     */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "FakeDataSourceWithPropertyBinding{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
