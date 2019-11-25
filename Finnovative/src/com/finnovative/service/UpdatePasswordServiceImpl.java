package com.finnovative.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.UpdatePasswordDao;
@Service
public class UpdatePasswordServiceImpl implements UpdatePasswordService{
	@Autowired
	UpdatePasswordDao dao;
	public UpdatePasswordDao getDao() {
		return dao;
	}
	public void setDao(UpdatePasswordDao dao) {
		this.dao = dao;
	}
	@Override
	@Transactional
	public String modifyPassword(String password,String email) {
	int result = getDao().updatePassword(password,email);
		if(result != 0){
			return password;
		}else{
		
		}return null;
		
	}

}
