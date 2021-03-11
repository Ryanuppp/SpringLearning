package com.AdSpy.Test;

import com.AdSpy.dao.AdDao;
import com.AdSpy.dao.UserDao;
import com.AdSpy.entity.Advertisement;
import com.AdSpy.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdDao adDao = ac.getBean(AdDao.class);
        Advertisement ad = adDao.findAdByCreatorId(1);
        System.out.println(ad.toString());
    }
}
