package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class XyzUserDao implements UserDao{
	private List<String> users = new ArrayList<String>();

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.getFirstname());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getFirstname());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi : " + user.getFirstname());
		
	}

	@Override
	public void addEmail(User user) {
		users.add(user.getEmail());
	}

	@Override
	public List<String> getEmail() {
		return users;
	}

	
	
}