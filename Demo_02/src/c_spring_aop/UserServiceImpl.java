package c_spring_aop;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("ADD");
    }
    @Override
    public void updateUser() {
        System.out.println("UPDATE");
    }
    @Override
    public void deleteUser() {
        System.out.println("DELETE");
    }
}
