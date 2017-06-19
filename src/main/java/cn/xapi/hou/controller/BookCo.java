package cn.xapi.hou.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.xapi.hou.dto.Result;
import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.Readerinfo;
import cn.xapi.hou.service.BookInfoService;
import cn.xapi.hou.service.BorrowService;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月10日 下午12:37:34
 * @description
 */
@Controller

public class BookCo {
	@Autowired
	private BookInfoService book;
	@Autowired
	private BorrowService borrow;

	// 返回主页面
	@RequestMapping("bookAll")
	public String bookAll(Model model) {
		List<Bookinfo> selectBookAll = book.selectBookAll();
		model.addAttribute("bookList", selectBookAll);
		return "index";
	}

	// 返回书籍详情页面
	// 查询单个书籍信息
	@RequestMapping("bookdetail")
	public String bookdetail(Model model, Integer callno, HttpServletRequest request) {
		Bookinfo bookinfo = book.selectByPrimaryKey(callno);
		model.addAttribute("bookinfo", bookinfo);
		return "font/bookdetail/bookinfo";

	}

	/**
	 * 
	 * @param model
	 * @param callno
	 * @param request
	 * @description 预约
	 */

	@RequestMapping("orderBook")
	@ResponseBody
	public Result<?> orderBook(Model model, @RequestParam("orderbookno") Integer orderbookno,
			HttpServletRequest request, HttpSession session) {
		Readerinfo record = (Readerinfo) session.getAttribute("userNo");
		Map<String, Object> map = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String currentDate = format.format(new Date());
		// 预约库存-1
		map.put("booknumber", 0);
		map.put("bookno", orderbookno);

		// 当前用户借同一本书的数量
		map1.put("callno", orderbookno);
		map1.put("readno", record.getReaderno());

		// 预约信息入库
		map2.put("yuyuebookno", orderbookno);
		map2.put("yuyueUserNo", record.getReaderno());
		
		map2.put("intime", currentDate);
		map2.put("outtime", currentDate);

		if (book.selectBookNumber(orderbookno) < 1) {
			return new Result<>(false, "库存不足");
		}

		if (borrow.selectIsNotOutbook(map1) >= 1) {

			return new Result<>(false, "不能重复预约相同的书");
		}
		book.updateBookNumber(map);// 库存-1当总数够的情况下
		borrow.yuyueBook(map2); // 预约信息入库

		return new Result<>(true, "预约成功！！");
	}

	/**
	 * 综合查询用户的借书信息及书籍信息，用户信息。 返回我的图书页面
	 */
	@RequestMapping("queryBorrowAllBook")
	public ModelAndView queryBorrowAllBook(HttpSession session,	@RequestParam(required = true, defaultValue = "1") Integer page,
			@RequestParam(required = false, defaultValue = "4") Integer pageSize ) {
		ModelAndView model=new ModelAndView();
		Readerinfo record = (Readerinfo) session.getAttribute("userNo");
	/*	if (record==null) {
			model.setViewName("forward:bookAll.action");
		}else{*/
			PageHelper.startPage(page,pageSize);
		List<Borrow> borrowList = borrow.selectReaderBorrowAllInfo(record.getReaderno());
		PageInfo<Borrow> p = new PageInfo<Borrow>(borrowList);
		model.addObject("page", p);
		model.addObject("borrowList", borrowList);
		model.setViewName("font/bookdetail/mybook");
//		}
		return model;
	}
}
