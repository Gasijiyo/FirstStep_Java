package edu.java.jdbc05;

import java.util.List;

// MVC 아키텍쳐에서 Controller에 해당하는 인터페이스
public interface BlogDao {
	
	List<Blog> select();
	Blog select(int no);
	int insert(Blog blog);
	int update(Blog blog);
	int delete(int no);

}