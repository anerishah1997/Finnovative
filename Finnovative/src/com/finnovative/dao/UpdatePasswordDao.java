package com.finnovative.dao;

import com.finnovative.model.Users;

public interface UpdatePasswordDao {
	public int updatePassword(String password, String email);

}
