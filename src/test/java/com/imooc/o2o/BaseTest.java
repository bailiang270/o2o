package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置Spring和junit整合，junit启动时启动IOC容器
 * @author MRBai
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉  junit  spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
