package com.bit.boardapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bit.boardapp.entity.BoardFile;

public interface BoardFileRepository extends JpaRepository <BoardFile, Long> {
}
