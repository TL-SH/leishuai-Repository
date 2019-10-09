package com.tl.springboot.mapper;

import com.tl.springboot.pojo.TAdmin;
import java.util.List;

/**
 * @author tanglei
 * @date 2019/9/18  19:09
 */
//@Mapper
public interface TAdminMapper {

    List<TAdmin> listAdmins();

}