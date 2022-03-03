package dev.bong.mybatis.mapper;

import dev.bong.mybatis.dto.BoardDto;

public interface BoardMapper {
    int createBoard(BoardDto dto);
}
