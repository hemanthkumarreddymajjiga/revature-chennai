package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.Instagramuser;

public class InstagramService implements InstagramServiceInterface {

	@Override
	public int createProfileService(Instagramuser iu) {
		InstagramDAOInterface id=new InstagramDAO();
		int i=id.createprofileDAO();
		// TODO Auto-generated method stub
		return i;
	}

}
