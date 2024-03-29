package com.pinyougou.mannager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;

  @RestController
	@RequestMapping("/brand")
	public class BrandController {

	    @Reference
	    private BrandService brandService;

	    /**
	     * 返回全部列表
	     *
	     * @return
	     */
	    @RequestMapping("/findAll")
	    public List<TbBrand> findAll() {
	        return brandService.findAll();
	    }


	    /**
	     * 返回全部列表
	     *
	     * @return
	     */
	    @RequestMapping("/findPage")
	    public PageResult findPage(int page, int rows) {
	        return brandService.findPage(page, rows);
	    }

	  }
	
	
	

