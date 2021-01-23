package toyboard.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import toyboard.Service.BoardService;
import toyboard.dto.BoardDto;

@Controller //컨트롤러임을 명
@AllArgsConstructor
public class BoardController {


    private BoardService boardService;

    @GetMapping("/")
    public String list() {
        return "board/list.html";

    }

    @GetMapping("/post")
    public String write() {
        return "board/write.html";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}
