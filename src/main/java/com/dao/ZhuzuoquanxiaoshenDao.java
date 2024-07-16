package com.dao;

import com.entity.ZhuzuoquanxiaoshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuzuoquanxiaoshenVO;
import com.entity.view.ZhuzuoquanxiaoshenView;


/**
 * 著作权校审
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface ZhuzuoquanxiaoshenDao extends BaseMapper<ZhuzuoquanxiaoshenEntity> {
	
	List<ZhuzuoquanxiaoshenVO> selectListVO(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
	
	ZhuzuoquanxiaoshenVO selectVO(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
	
	List<ZhuzuoquanxiaoshenView> selectListView(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);

	List<ZhuzuoquanxiaoshenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
	
	ZhuzuoquanxiaoshenView selectView(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
}
