package edu.nf.ch04.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/1
 */
public class SpringTest {

    @Test
    public void testLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        context.getBean("people");
        //在实现类中会提供一个close方法用于关闭容器，因此当关闭容器前
        //否会执行所有Bean的destroy方法
        ((ClassPathXmlApplicationContext)context).close();

    }
}
