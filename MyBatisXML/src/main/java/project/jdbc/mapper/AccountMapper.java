package project.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import project.jdbc.domain.Account;

@Mapper
public interface AccountMapper {
	
	public List<Account> findAccountsByUserId(Long id);
	
}
