package io.github.mokaim.mapper;

import org.springframework.stereotype.Repository;

@Repository("io.github.mokaim.mapper.BoardMapper")
public interface BoardMapper {
	
	public int boardCount() throws Exception;
	
}
