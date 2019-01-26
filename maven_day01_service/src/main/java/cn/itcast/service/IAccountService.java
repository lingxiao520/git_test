package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface IAccountService {
    /**
     * 查找所有用户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存用户
     */
    public void saveAccount(Account account);
}
