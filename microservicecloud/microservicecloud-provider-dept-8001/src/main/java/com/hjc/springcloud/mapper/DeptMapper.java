package com.hjc.springcloud.mapper;

import com.hjc.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper
{
	 boolean addDept(Dept dept);

	Dept findById(Long id);

	List<Dept> findAll();
}
