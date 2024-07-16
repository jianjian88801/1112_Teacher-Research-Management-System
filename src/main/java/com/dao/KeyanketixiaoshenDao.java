package com.dao;

import com.entity.KeyanketixiaoshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanketixiaoshenVO;
import com.entity.view.KeyanketixiaoshenView;


/**
 * 科研课题校审
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface KeyanketixiaoshenDao extends BaseMapper<KeyanketixiaoshenEntity> {
	
	List<KeyanketixiaoshenVO> selectListVO(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
	
	KeyanketixiaoshenVO selectVO(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
	
	List<KeyanketixiaoshenView> selectListView(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);

	List<KeyanketixiaoshenView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
	
	KeyanketixiaoshenView selectView(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
}
