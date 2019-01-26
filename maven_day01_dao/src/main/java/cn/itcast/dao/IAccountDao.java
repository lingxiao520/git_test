package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {
    /**
     * 查找所有用户
     * @return
     */
    //@Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存用户
     */
    //@Insert("insert into account(name,money)values(#{name},#{money})")
    public void saveAccount(Account account);
}
