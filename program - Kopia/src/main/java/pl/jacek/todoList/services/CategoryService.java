package pl.jacek.todoList.services;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.jacek.todoList.dao.ICategoryDao;
import pl.jacek.todoList.model.Category;
import pl.jacek.todoList.model.User;

@Service
public class CategoryService extends BaseService<ICategoryDao, Category> {
	
	public List<Category> categoryByUser(User user) {
		return iDao.findByUser(user);
	}
	
	public boolean doesExist(Long id) {
		return (findById(id) != null);
	}
}
