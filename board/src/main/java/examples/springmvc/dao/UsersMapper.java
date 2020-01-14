package examples.springmvc.dao;

import java.util.List;

import examples.springmvc.dto.User;
import examples.springmvc.mapper.Mapper;

@Mapper
public interface UsersMapper {
	public List<User> getUsers();
	
}
