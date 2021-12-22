package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sound.midi.Soundbank;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## BeanLifeCycle constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean name is " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle bean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleDemoBeen has its properties.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The @PostConstruct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The @PreDestroy annotated method has been called.");
    }

    public void beforeInit() {
        System.out.println(" -- Calling beforeInit --");
    }

    public void afterInit() {
        System.out.println(" -- Calling afterInit --");
    }
}
