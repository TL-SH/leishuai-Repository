package com.tl.springboot.service.impl;

import com.tl.springboot.mapper.TAdminMapper;
import com.tl.springboot.pojo.TAdmin;
import com.tl.springboot.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tanglei
 * @date 2019/9/18  19:08
 */
@Service
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    TAdminMapper adminMapper;

    @Override
    public List<TAdmin> listAdmins() {
        return adminMapper.listAdmins();
    }

}
