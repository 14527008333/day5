package com.bw.controller;


import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Dy;
import com.bw.bean.Fl;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Autowired
	private MyService ms;
	
	@RequestMapping("list.do")
	public Object getlist(Model m
			,@RequestParam(defaultValue="")String mh
			,@RequestParam(defaultValue="1")Integer page){
		PageHelper.startPage(page, 5);
		List<Object> list=ms.getlist(mh);
		PageInfo<Object> pi = new PageInfo<>(list);
		
		m.addAttribute("list", list);
		m.addAttribute("mh", mh);
		m.addAttribute("pi", pi);
		
		
		return "list";
	}
	
	@RequestMapping("toadd.do")
	public Object toadd(){
		return "add";
	}
	
	@RequestMapping("toupdate.do")
	public Object toupdate(){
		return "update";
	}
	
	@RequestMapping("duoxuan.do")
	@ResponseBody
	public Object duoxuan(){
		List<Fl> list=ms.duoxuan();
		return list;
	}
	@RequestMapping("huixian.do")
	@ResponseBody
	public Object huixian(String did){
		Map<Object, Object> map=ms.huixian(did);
		return map;
	}
	
	@RequestMapping("add.do")
	public Object add(Dy dy,String[] fids){
		int i = ms.adddy(dy,fids);
		return "redirect:list.do";
	}
	@RequestMapping("update.do")
	public Object update(Dy dy,String[] fids){
		int i = ms.update(dy,fids);
		return "redirect:list.do";
	}
	@RequestMapping("delete.do")
	public Object delete(String dids){
		int i = ms.delete(dids);
		return "redirect:list.do";
	}
	
	
}
