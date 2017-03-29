package cn.sqhl.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.Dictionary;
import cn.sqhl.shop.core.PaginationInterceptor;

public interface DictionaryMapper {
    List<Dictionary> queryDictionary(@Param(PaginationInterceptor.PAGE_PARAM_KEY) PageCond page,@Param("map") Map<String, Object> map);
}