package project.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.jdbc.domain.Account;
import project.jdbc.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public List<Account> findAccountsByUserId(Long id) {
		return accountMapper.findAccountsByUserId(id) ;
	}

}
