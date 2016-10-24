package project.jdbc.service;

import java.util.List;

import project.jdbc.domain.Account;

public interface AccountService {
	public List<Account> findAccountsByUserId(Long id);
}
