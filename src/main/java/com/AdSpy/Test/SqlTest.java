package com.AdSpy.Test;

import com.AdSpy.dao.AdDao;
import com.AdSpy.dao.UserDao;
import com.AdSpy.entity.Advertisement;
import com.AdSpy.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlTest {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destroy()throws IOException {
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for(User user :users) {
            System.out.println(user.toString());
            System.out.println(user.getAds());
        }
    }
//
//    @Test
//    public void insertUser(){
//        User user = new User();
//        user.setUsername("Ryan");
//        user.setPassword("123456");
//        userDao.saveUser(user);
//
//        sqlSession.commit();
//    }
//
//
//    @Test
//    public void updateUser(){
//        User user = new User();
//        user.setUsername("jeff");
//        user.setPassword("567");
//        userDao.updateUser(user);
//    }
//
//    @Test
//    public void deleteUser(){
//        userDao.deleteUser(3);
//    }
//
//    @Test
//    public void findUserById(){
//        User user = userDao.findById(2);
//        System.out.println(user.toString());
//    }
//
//    @Test
//    public void findTotal(){
//        int count = userDao.findTotal();
//        System.out.println(count);
//    }

//      @Test
//      public void testFindAll(){
//          List<Advertisement> ads = adDao.findAll();
//          for(Advertisement ad:ads){
//              System.out.println(ad.toString());
//          }
//      }
}
