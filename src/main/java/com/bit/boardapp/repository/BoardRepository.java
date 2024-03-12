package com.bit.boardapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.boardapp.entity.Board;

public interface BoardRepository extends JpaRepository <Board, Long>, BoardRepositoryCustom {
    
}
