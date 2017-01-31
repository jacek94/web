package pl.jacek.todoList.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jacek.todoList.model.Category;
import pl.jacek.todoList.model.User;

@Repository
public interface ICategoryDao extends CrudRepository<Category, Long> {
	public Category findById(Long id);
	public List<Category> findByUser(User user);
}
