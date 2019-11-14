package com.itheima.b_di;

public class BookServiceImpl implements BookService {
	
	//方式1：之前，接口=实现类
//	private BookDao bookDao = new BookDaoImpl();
	//方式2：接口 + setter方法
	private BookDao bookDao;
	private BookDao bookDao2;
	private StudentDao studentkDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	public void setBookDao2(BookDao bookDao) {
		this.bookDao2 = bookDao;
	}
	public void setStudentDao(StudentDao studentkDao) {
		this.studentkDao = studentkDao;
	}
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("be new");
	}
	
	
	@Override
	public void addBook() {
		this.bookDao.save();
	}
	
	@Override
	public void addBook2() {
		this.bookDao2.delet();
	}
	
	@Override
	public void testStu() {
		// TODO Auto-generated method stub
		this.studentkDao.Test();
	}
}
