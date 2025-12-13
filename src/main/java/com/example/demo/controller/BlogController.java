package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.Optional;

import com.example.demo.model.domain.Board;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;
// 최상단 서비스 클래스 연동 추가

import jakarta.servlet.http.HttpSession;

@Controller // 컨트롤러 어노테이션 명시

public class BlogController {
    // 클래스 하단 작성
    @Autowired
    BlogService blogService; // DemoController 클래스 아래 객체 생성

    @GetMapping("/board_list") // 새로운 게시판 링크 지정
    public String board_list(Model model, @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "") String keyword, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        String email = (String) session.getAttribute("email");

        PageRequest pageable = PageRequest.of(page, 3); // 한 페이지의 게시글 수
        Page<Board> list; // Page를 반환

        int pageSize = pageable.getPageSize();
        int startNum = page * pageSize + 1;

        if (userId == null) {
            return "redirect:/member_login"; // 로그인 페이지로 리다이렉션
        }
        System.out.println("세션 userId: " + userId); // 서버 IDE 터미널에 세션 값 출력

        if (keyword.isEmpty()) {
            list = blogService.findAll(pageable); // 기본 전체 출력(키워드 x)
        } else {
            list = blogService.searchByKeyword(keyword, pageable); // 키워드로 검색
        }

        model.addAttribute("boards", list); // 모델에 추가
        model.addAttribute("totalPages", list.getTotalPages()); // 페이지 크기
        model.addAttribute("currentPage", page); // 페이지 번호
        model.addAttribute("keyword", keyword); // 키워드
        model.addAttribute("email", email);
        model.addAttribute("startNum", startNum);

        return "board_list"; // .HTML 연결
    }

    @GetMapping("/board_view/{id}") // 게시판 링크 지정
    public String board_view(Model model, @PathVariable Long id) {
        Optional<Board> list = blogService.findById(id); // 선택한 게시판 글
        if (list.isPresent()) {
            model.addAttribute("boards", list.get()); // 존재할 경우 실제 Board 객체를 모델에 추가
        } else {
            // 처리할 로직 추가 (예: 오류 페이지로 리다이렉트, 예외 처리 등)
            return "/error_page/article_error"; // 오류 처리 페이지로 연결
        }
        return "board_view"; // .HTML 연결
    }

    // 글쓰기 게시판
    @GetMapping("/board_write")
    public String board_write() {
        return "board_write";
    }

    @GetMapping("/board_edit/{id}") // 게시판링크지정
    public String board_edit(Model model, @PathVariable Long id) {
        Optional<Board> list = blogService.findById(id); // 선택한 게시판 글
        if (list.isPresent()) {
            model.addAttribute("boards", list.get()); // 존재하면Article 객체를 모델에 추가
        } else {
            // 처리할로직추가(예: 오류페이지로리다이렉트, 예외처리등)
            return "/error_page/article_error"; // 오류처리페이지로 연결 (이름 수정됨)
        }
        return "board_edit"; // .HTML 연결
    }

    @PostMapping("/api/boards") // 글쓰기 게시판 저장
    public String addboards(@ModelAttribute AddArticleRequest request, HttpSession session) {

        // 로그인한 사용자 가져오기
        String name = (String) session.getAttribute("name");

        // 로그인 안 된 경우 방어
        if (name == null) {
            return "redirect:/member_login";
        }

        // 작성자를 로그인 사용자로 강제 설정
        request.setUser(name);

        blogService.save(request);
        return "redirect:/board_list"; // .HTML 연결
    }

    @PutMapping("/api/board_edit/{id}")
    public String updateArticle2(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
        blogService.update(id, request);
        return "redirect:/board_list"; // 글 수정 이후 .html 연결
    }

    @DeleteMapping("/api/board_delete/{id}")
    public String deleteArticle2(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/board_list";
    }

    @ControllerAdvice
    public class GlobalExceptionHandler {

        // URL PathVariable이 Long으로 변환되지 않을 때 발생하는 예외 처리
        @ExceptionHandler(MethodArgumentTypeMismatchException.class)
        public String handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
            return "/error_page/article_error"; // 원하는 에러 페이지
        }

        // 그 외 모든 예외 처리 (선택)
        @ExceptionHandler(Exception.class)
        public String handleGeneralException(Exception ex) {
            return "/error_page/article_error";
        }
    }

}
