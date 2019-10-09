package com.tl.springboot.controller;

import com.tl.springboot.pojo.TAdmin;
import com.tl.springboot.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.sql.DataSource;
import java.util.List;

/**
 * @author tanglei
 * @date 2019/9/18  19:06
 */
@Controller
public class TAdminController {

    @Autowired
    TAdminService adminService;

    @Autowired
    DataSource dataSource;

    @RequestMapping("/listAdmins")
    public String listAdmins(){
        /**
         * SpringBoot启动时，如果代码中需要使用数据库连接，默认会创建HikariDataSource  优化数据库连接的操作
         * 	- 性能非常好
         * Druid:
         * 		- 性能较高
         * 		- 可以监控sql的执行
         * 		- 步骤：
         * 			1、依赖druid的jar
         * 			2、向容器中配置druid连接池的对象
         */
        List<TAdmin> list =  adminService.listAdmins();
        System.out.println(list);

        System.out.println(dataSource.getClass());
        return "admin/admin";
    }

}