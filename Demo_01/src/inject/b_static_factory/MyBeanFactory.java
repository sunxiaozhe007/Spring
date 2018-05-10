package inject.b_static_factory;

/**
 * 静态工厂
 */
public class MyBeanFactory {

    /**
     * 创建实例
     * @return
     */
    public static UserService createService(){
        return new UserServiceImpl();
    }
}

