package com.dpworld.flyway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dpworld.flyway.model.Users;

@Service
public interface UsersService {
	List<Users> getAllUserss();

	void saveUser(Users Users);

	Users getUsersById(long id);

	void deleteUsersById(long id);
}