package com.dao;

import com.entity.ZhuanlixiaoshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlixiaoshenVO;
import com.entity.view.ZhuanlixiaoshenView;


/**
 * 专利校审
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public interface ZhuanlixiaoshenDao extends BaseMapper<ZhuanlixiaoshenEntity> {
	
	List<ZhuanlixiaoshenVO> selectListVO(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
	
	ZhuanlixiaoshenVO selectVO(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
	
	List<ZhuanlixiaoshenView> selectListView(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);

	List<ZhuanlixiaoshenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
	
	ZhuanlixiaoshenView selectView(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
}
