package com.dao;

import com.entity.ZhuanlixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanlixinxiVO;
import com.entity.view.ZhuanlixinxiView;


/**
 * 专利信息
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface ZhuanlixinxiDao extends BaseMapper<ZhuanlixinxiEntity> {
	
	List<ZhuanlixinxiVO> selectListVO(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	
	ZhuanlixinxiVO selectVO(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	
	List<ZhuanlixinxiView> selectListView(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);

	List<ZhuanlixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	
	ZhuanlixinxiView selectView(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
}
