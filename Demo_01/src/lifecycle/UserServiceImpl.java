package lifecycle;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("孙晓哲lifecycle");
    }

    public void myInit(){
        System.out.println("初始化");
    }
    public void myDestroy(){
        System.out.println("销毁");
    }
}
