package pl.jacek.todoList.services;

import org.springframework.stereotype.Service;

import pl.jacek.todoList.dao.ICategoryColorDao;
import pl.jacek.todoList.model.CategoryColor;

@Service
public class CategoryColorService extends BaseService<ICategoryColorDao, CategoryColor> {

	public boolean doesExist(Long id) {
		return (findById(id) != null);
	}
	
	public CategoryColor addMissingHashes(CategoryColor categoryColor) {
		if (categoryColor.getPrimaryCode().length()==6) categoryColor.setPrimaryCode("#" + categoryColor.getPrimaryCode());
		if (categoryColor.getSecondaryCode().length()==6) categoryColor.setSecondaryCode("#" + categoryColor.getSecondaryCode());
		return categoryColor;
	}
}
