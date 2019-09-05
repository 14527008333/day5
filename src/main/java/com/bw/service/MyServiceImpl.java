package com.bw.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Dy;
import com.bw.bean.Fl;
import com.bw.dao.MyDao;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	private MyDao md;

	@Override
	public List<Object> getlist(String mh) {
		List<Object> list=md.getlist(mh);
		return list;
	}

	@Override
	public List<Fl> duoxuan() {
		List<Fl> list=md.duoxuan();
		return list;
	}

	@Override
	public int adddy(Dy dy, String[] fids) {
		int i =md.adddy(dy);
		Map<Object, Object> map=new HashMap<>();
		map.put("did", dy.getDid());
		map.put("fids", fids);
		i = md.addzhong(map);
		return i;
	}

	@Override
	public int delete(String dids) {
		int i = md.deletedy(dids);
		i=md.deletezhong(dids);
		return i;
	}

	@Override
	public Map<Object, Object> huixian(String did) {
		Map<Object, Object> map= md.huixian(did);
		return map;
	}

	@Override
	public int update(Dy dy, String[] fids) {
		int i = md.updatedy(dy);
		System.out.println(i);
		i=md.deletezhong(dy.getDid().toString());
		System.out.println(i);
		Map<Object, Object> map=new HashMap<>();
		map.put("did", dy.getDid());
		map.put("fids", fids);
		i = md.addzhong(map);
		System.out.println(i);
		return i;
	}
	
}
