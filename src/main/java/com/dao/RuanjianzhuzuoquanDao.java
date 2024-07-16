package com.dao;

import com.entity.RuanjianzhuzuoquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuanjianzhuzuoquanVO;
import com.entity.view.RuanjianzhuzuoquanView;


/**
 * 软件著作权
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface RuanjianzhuzuoquanDao extends BaseMapper<RuanjianzhuzuoquanEntity> {
	
	List<RuanjianzhuzuoquanVO> selectListVO(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
	
	RuanjianzhuzuoquanVO selectVO(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
	
	List<RuanjianzhuzuoquanView> selectListView(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);

	List<RuanjianzhuzuoquanView> selectListView(Pagination page,@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
	
	RuanjianzhuzuoquanView selectView(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
}
