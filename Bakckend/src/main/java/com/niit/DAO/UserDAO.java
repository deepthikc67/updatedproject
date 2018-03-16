package com.niit.DAO;
import java.util.List;
import com.niit.Model.User;

public interface UserDAO 
  {
	public boolean addUser(User user);
	public User getUser (int  userId);
	public boolean deleteUser(int userID);
	public boolean updateUser(User user);
	public List<User> getUsers();
}
