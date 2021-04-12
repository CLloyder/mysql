package com.database.mysql.service;

import  com.database.mysql.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
