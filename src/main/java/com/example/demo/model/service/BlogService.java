package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Board;
import com.example.demo.model.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 생성자자동생성(부분)

public class BlogService {
    @Autowired // 객체주입자동화, 생성자1개면생략가능
    private final BoardRepository boardRepository; // 리포지토리선언

    public List<Board> findAll() { // 게시판전체목록조회
        return boardRepository.findAll();
    }

    public Page<Board> findAll(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    public Page<Board> searchByKeyword(String keyword, Pageable pageable) {
        return boardRepository.findByTitleContainingIgnoreCase(keyword, pageable);
    }

    public Board save(AddArticleRequest request) {
        // DTO가 없는 경우 이곳에 직접 구현 가능
        return boardRepository.save(request.toEntity());
    }

    public Optional<Board> findById(Long id) { // 게시판특정글조회
        return boardRepository.findById(id);
    }

    public void update(Long id, AddArticleRequest request) {
        Optional<Board> optionalBoard = boardRepository.findById(id); // 단일글조회
        optionalBoard.ifPresent(Board -> { // 값이있으면
            String user = Board.getUser();
            String newdate = Board.getNewdate();
            String count = Board.getCount();
            String likec = Board.getLikec();

            Board.update(request.getTitle(), request.getContent(), user, newdate, count, likec); // 값을수정
            boardRepository.save(Board); // Board 객체에저장
        });
    }

    public void delete(Long id) {
        boardRepository.deleteById(id);
    }

}