package com.lw.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/7/15
 */
@Repository
public interface StudentDao {
    String getName(String id);
}
