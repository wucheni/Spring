package edu.nf.ch20.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/9
 */
public class TaskTest {

    @Test
    public void testTask(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        while(true);
    }
}
