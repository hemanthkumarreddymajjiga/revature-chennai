package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.Instagramuser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface {
	Scanner sc=new Scanner(System.in);
	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Enter your address");
		String address=sc.next();
		
		Instagramuser iu= new Instagramuser();
		
		InstagramServiceInterface is=new InstagramService();
		
		int i= is.createProfileService(iu);
		if(i>0) {
			System.out.println("Profile Created");
		}else {
			System.out.println("Profile removed");
		}
		
		

	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
