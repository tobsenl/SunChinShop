package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.core.PaginationInterceptor;
import cn.sqhl.shop.vo.BrowHistory;
import cn.sqhl.shop.vo.Collected;

public interface GoodsChildPriceMapper {
	public List<BrowHistory> queryBrowHistoryList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page, Map<String,Object> obj);
	
	public List<Collected> queryCollectedList(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page, Map<String,Object> obj);
}