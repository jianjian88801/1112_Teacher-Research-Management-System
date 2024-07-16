package com.dao;

import com.entity.KeyanketiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanketiVO;
import com.entity.view.KeyanketiView;


/**
 * 科研课题
 * 
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface KeyanketiDao extends BaseMapper<KeyanketiEntity> {
	
	List<KeyanketiVO> selectListVO(@Param("ew") Wrapper<KeyanketiEntity> wrapper);
	
	KeyanketiVO selectVO(@Param("ew") Wrapper<KeyanketiEntity> wrapper);
	
	List<KeyanketiView> selectListView(@Param("ew") Wrapper<KeyanketiEntity> wrapper);

	List<KeyanketiView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanketiEntity> wrapper);
	
	KeyanketiView selectView(@Param("ew") Wrapper<KeyanketiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KeyanketiEntity> wrapper);
}
