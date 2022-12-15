package org.lucamusumeci.sfgdi.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println(this.getClass().getSimpleName() + "'s constructor.");
    }

    public void method(){
        System.out.println(this.getClass().getSimpleName() + "'s method.");
    }
}
