package com.watent.spring.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
        registerBeanDefinitionParser("mongo", new MongoBeanDefinitionParser());
    }

}