package com.smdlg.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
    /*private BoardService boardServiceImpl;*/
    
	@RequestMapping(value="home", method = { RequestMethod.GET, RequestMethod.POST } )
	public String home() {
		
		return "home";
	}
	
    /**
     * 게시판 조회
     * @param boardVO
     * @param model
     * @return
     * @throws Exception
     */
	
	@RequestMapping(value="board", method = { RequestMethod.GET, RequestMethod.POST } )
	public String board() {
		
		return "board";
	}
   /*@RequestMapping(value="/board/List")
    public String boardList(@ModelAttribute("boardVO") BoardVO boardVO,
            @RequestParam(defaultValue="1") int curPage,
            HttpServletRequest request,
            Model model) throws Exception{
        
        
 
        // 전체리스트 개수
        int listCnt = boardService.select(boardVO);
        
        Pagination pagination = new Pagination(listCnt, curPage);
        
        boardVO.setStartIndex(pagination.getStartIndex());
        boardVO.setCntPerPage(pagination.getPageSize());
        // 전체리스트 출력
        List<BoardVO> list = boardService.select(boardVO);
                
        model.addAttribute("list", list);
        model.addAttribute("listCnt", listCnt);
        
        
        model.addAttribute("pagination", pagination);
        
        return "board/boardList";
    }*/
}
