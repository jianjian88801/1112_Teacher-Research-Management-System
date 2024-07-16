package com.dao;

import com.entity.LunwenxiaoshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenxiaoshenVO;
import com.entity.view.LunwenxiaoshenView;


/**
 * 论文校审
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface LunwenxiaoshenDao extends BaseMapper<LunwenxiaoshenEntity> {
	
	List<LunwenxiaoshenVO> selectListVO(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
	
	LunwenxiaoshenVO selectVO(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
	
	List<LunwenxiaoshenView> selectListView(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);

	List<LunwenxiaoshenView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
	
	LunwenxiaoshenView selectView(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
}
