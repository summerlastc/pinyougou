package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;



public interface BrandService {

	
	public List<TbBrand> findAll();
	
	
	public PageResult findPage(int pageNum,int pageSize);
	
}
