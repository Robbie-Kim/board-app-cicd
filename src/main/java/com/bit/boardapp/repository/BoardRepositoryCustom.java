package com.bit.boardapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bit.boardapp.entity.Board;

public interface BoardRepositoryCustom {
    Page<Board> searchAll (Pageable pageable, String searchCondition, String searchKeyword);
}
