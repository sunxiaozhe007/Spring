package C3p0;

import domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;

public class UserDao {

    //jdbc模板将由spring注入
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update(User user){
        String sql = "update user set username=?,password=? where id=?";
        Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
        jdbcTemplate.update(sql,args);
    }

    public List<User> findAll() {
        return jdbcTemplate.query("select * from user",BeanPropertyRowMapper.newInstance(User.class));
    }
}
