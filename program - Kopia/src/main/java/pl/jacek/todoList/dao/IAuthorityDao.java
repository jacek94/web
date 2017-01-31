package pl.jacek.todoList.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jacek.todoList.model.Authority;

@Repository
public interface IAuthorityDao extends CrudRepository<Authority, Long> {
	public Authority findById(Long id);
}
