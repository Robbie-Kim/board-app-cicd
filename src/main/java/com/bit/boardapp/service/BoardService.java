package com.bit.boardapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.bit.boardapp.dto.BoardDTO;
import com.bit.boardapp.dto.BoardFileDTO;

public interface BoardService {
    Page<BoardDTO> searchAll(Pageable pageable, String searchCondition, String searchKeyword);

    public void post (BoardDTO boardDTO);

    BoardDTO findById(long boardNo);

    void modify(BoardDTO boardDTO, List<BoardFileDTO> uBoardFileList);

    void deleteById(long boardNo);
}
