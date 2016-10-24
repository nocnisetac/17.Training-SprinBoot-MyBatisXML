package project.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import project.jdbc.domain.User;

@Mapper
public interface UserMapper {
	
	public List<User> findAll();

	public User findUserById(Long id);
	
	public List<User> findUsersWithAccounts();
	
}
