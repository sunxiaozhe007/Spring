package demo_2;

public class BookServiceImpl implements BookService {

    //方式1：之前，接口=实现类
    //private BaookDao bookDao = new BookDaoImpl();

    //方式2：接口+setter方法
    private BaookDao baookDao;
    public void setBaookDao(BaookDao baookDao) {
        this.baookDao = baookDao;
    }
    @Override
    public void addBook(){

        this.baookDao.addBook();

    }

    public BookServiceImpl(){
        System.out.println("被创建");
    }

}
