package d_aspect.a_xml;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("ADD");
    }

    @Override
    public String updateUser() {
        System.out.println("UPDATE");
       // int i = 1/0;
        return "sunxiaozhe";
    }

    @Override
    public void deleteUser() {
        System.out.println("DELETE");
    }
}
