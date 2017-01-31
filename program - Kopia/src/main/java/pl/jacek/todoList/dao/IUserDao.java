package pl.jacek.todoList.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jacek.todoList.model.User;

@Repository
public interface IUserDao extends CrudRepository<User, Long> {
	public List<User> findAll();
	public User findById(Long id);
	public User findByLogin(String login);
	public User findByEmail(String email);
}
