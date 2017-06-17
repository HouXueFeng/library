package cn.xapi.hou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xapi.hou.dto.Result;
import cn.xapi.hou.po.Readerinfo;
import cn.xapi.hou.service.ReadInfotService;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月11日 上午11:13:50
 * @description
 */
@Controller
public class LoginCo {

	@Autowired
	private ReadInfotService reader;

	@RequestMapping("login")
	public String login(HttpSession session ) {
		session.setAttribute("userNo", null);
		
		return "login";
	}

	// @RequestMapping("/loginSuccess")
	// public String loginSuccess(Model model) {
	// return "login";
	// }
	//
	//
	@RequestMapping("/register")
	@ResponseBody
	public Result<Readerinfo> register(Model model, Readerinfo record, HttpServletRequest request) {

		if (record.getPhone() == null || record.getReadermajor() == null || record.getReadername() == null
				|| record.getReaderno() == null || record.getReaderpassword() == null || record.getPhone().equals("")
				|| record.getReadermajor().equals("") || record.getReadername().equals("")
				|| record.getReaderno().equals("") || record.getReaderpassword().equals("")) {
			return new Result<Readerinfo>(false, "注册信息不能插入空值");
		}
		if (reader.registerNameOrExits(record) >= 1) {
			return new Result<Readerinfo>(false, "用户名已经存在");

		}
		int insert = reader.insert(record);
		if (insert > 0) {
			return new Result<Readerinfo>(true, record);
		}
		return new Result<Readerinfo>(false, "fail");
	}

	@RequestMapping("/userLogin")
	@ResponseBody
	public Result<Readerinfo> userLogin(Readerinfo record, HttpSession session,Model model) {
		

		if (record.getReaderno() == null || record.getReaderpassword() == null || record.getReaderno().equals("")
				|| record.getReaderpassword().equals("")) {

			return new Result<Readerinfo>(false, "用户名或密码不能为空");
		}
		if (reader.selectUsernameAndPassword(record) >= 1) {
			
			session.setAttribute("userNo", record);

			return new Result<Readerinfo>(true, "登录成功！");
		}
		return new Result<Readerinfo>(false, "用户名密码错误！");
	}

}
// @RequestMapping("layout")
// public String layout(Model model) {
// return "index";
// }
