package dao;

public interface AccountDao {

    /**
     * 汇款
     * @param outer
     * @param money
     */
    public void out(String outer, Double money);

    /**
     * 收款
     */
    public void in(String inner, Double money);
}
