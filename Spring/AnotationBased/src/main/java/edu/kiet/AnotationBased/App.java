package edu.kiet.AnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory= new AnnotationConfigApplicationContext(AnotationConfig.class);
        JavaFeatures jf = factory.getBean(JavaFeatures.class);
        jf.features();
        UseLanguage use = factory.getBean(UseLanguage.class);
        use.features();
    }
}
