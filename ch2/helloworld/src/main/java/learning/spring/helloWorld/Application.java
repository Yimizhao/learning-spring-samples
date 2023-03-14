package learning.spring.helloWorld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.beans.Beans;

public class Application {
    private static BeanFactory beanFactory;

    public static void main(String[] args) {
//        Hello hello = new Hello();
//        hello.sayHello();
        beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("Beans.xml");

        Hello hello = beanFactory.getBean("hello", Hello.class);
        hello.sayHello();
    }
}
