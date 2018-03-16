package com.niit.DAO;
import java.util.List;
import com.niit.Model.Category;

public interface CategoryDAO
{
    public boolean addCategory(Category category);
	public Category getCategory(int categoryId);
	public  boolean deleteCategory(int categoryId);
	public boolean updateCategory(Category category);
	public List<Category> getCategories();
	
}

