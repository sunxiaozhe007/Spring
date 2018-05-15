package service;

public interface AccountService {

    /**
     * 转账
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer, String inner, Double money);
}
