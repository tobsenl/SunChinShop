package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.CategoryPropertyValue;
import cn.sqhl.shop.vo.GoodsPropertyValue;
import cn.sqhl.shop.vo.brand;
import cn.sqhl.shop.vo.category;
import cn.sqhl.shop.vo.dictionary;


public interface SystemService {
	public List<category> queryCategoryList(PageCond page,Object obj);
	
	public List<dictionary> queryDictionaryList(PageCond page,Object obj);
	
	public List<brand> queryBrandList(PageCond page,Object obj);
	
	public List<GoodsPropertyValue> queryGoodsPropertyList(Object obj);
	
	public List<CategoryPropertyValue> queryCategoryPropertyList(Object obj);
	
}