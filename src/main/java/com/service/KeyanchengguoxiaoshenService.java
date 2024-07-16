package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanchengguoxiaoshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanchengguoxiaoshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanchengguoxiaoshenView;


/**
 * 科研成果校审
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public interface KeyanchengguoxiaoshenService extends IService<KeyanchengguoxiaoshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanchengguoxiaoshenVO> selectListVO(Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
   	
   	KeyanchengguoxiaoshenVO selectVO(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
   	
   	List<KeyanchengguoxiaoshenView> selectListView(Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
   	
   	KeyanchengguoxiaoshenView selectView(@Param("ew") Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KeyanchengguoxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KeyanchengguoxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KeyanchengguoxiaoshenEntity> wrapper);
}

