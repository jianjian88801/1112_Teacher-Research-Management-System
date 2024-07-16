package com.dao;

import com.entity.KeyanchengguoxiaoshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanchengguoxiaoshenVO;
import com.entity.view.KeyanchengguoxiaoshenView;


/**
 * 科研成果校审
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public interface KeyanchengguoxiaoshenDao extends BaseMapper<KeyanchengguoxiaoshenEntity> {
	
	List<KeyanchengguoxiaoshenVO> selectListVO(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
	
	KeyanchengguoxiaoshenVO selectVO(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
	
	List<KeyanchengguoxiaoshenView> selectListView(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);

	List<KeyanchengguoxiaoshenView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
	
	KeyanchengguoxiaoshenView selectView(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
}
