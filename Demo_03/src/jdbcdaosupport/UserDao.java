package jdbcdaosupport;

import domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDao extends JdbcDaoSupport {



    public void update(User user){
        String sql = "update user set username=?,password=? where id=?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        this.getJdbcTemplate().update(sql,args);
    }

    public List<User> findAll() {
        return this.getJdbcTemplate().query("select * from user",BeanPropertyRowMapper.newInstance(User.class));
    }
}
