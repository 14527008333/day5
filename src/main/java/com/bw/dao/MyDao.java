package com.bw.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Dy;
import com.bw.bean.Fl;

public interface MyDao {

	List<Object> getlist(@Param("mh")String mh);

	List<Fl> duoxuan();

	int adddy(Dy dy);

	int addzhong(Map<Object, Object> map);

	int deletedy(String dids);

	int deletezhong(String dids);

	Map<Object, Object> huixian(String did);

	int updatedy(Dy dy);

}
