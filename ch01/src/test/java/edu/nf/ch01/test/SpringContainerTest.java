package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/11/30
 */
public class SpringContainerTest {
    @Test
    public void testGetBean(){
        //初始化spring容器（也就是一个容器）
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象，根据id来获取
        //Users user = （Users）context.getBean("user");
        //使用泛型来获取
        Users user = context.getBean("user",Users.class);
        user.say();
        People people = context.getBean("people",People.class);
        people.run();
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users user = context.getBean("user1",Users.class);
        user.say();
    }
}
