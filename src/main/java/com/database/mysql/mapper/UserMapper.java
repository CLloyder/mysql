package com.database.mysql.mapper;

import  com.database.mysql.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);

}
