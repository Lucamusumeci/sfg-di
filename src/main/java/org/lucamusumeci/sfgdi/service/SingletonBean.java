package org.lucamusumeci.sfgdi.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //This is the default so it's not necessary to specify
@Component("singletonBean") //Again, this matches the default so it's not necessary to specify
public class SingletonBean {
    public SingletonBean() {
        System.out.println(this.getClass().getSimpleName() + "'s constructor.");
    }

    public void method(){
        System.out.println(this.getClass().getSimpleName() + "'s method.");
    }
}
