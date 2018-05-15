package service.Impl;

import dao.AccountDao;
import org.springframework.transaction.annotation.Transactional;
import service.AccountService;
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer, money);

        //int i = 1/0;

        accountDao.in(inner,money);
    }
}
