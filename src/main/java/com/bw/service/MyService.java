package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Dy;
import com.bw.bean.Fl;

public interface MyService {

	List<Object> getlist(String mh);

	List<Fl> duoxuan();

	int adddy(Dy dy, String[] fids);

	int delete(String dids);

	Map<Object, Object> huixian(String did);

	int update(Dy dy, String[] fids);

}
