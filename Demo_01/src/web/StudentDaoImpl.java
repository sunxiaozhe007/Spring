package web;

import org.springframework.stereotype.Repository;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("Dao");
    }
}
