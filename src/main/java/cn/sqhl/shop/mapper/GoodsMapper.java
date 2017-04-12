package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.vo.GoodsChildPrice;

public interface GoodsMapper {
	public List<GoodsChildPrice> queryGoodsList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page, Map<String,Object> obj);
}