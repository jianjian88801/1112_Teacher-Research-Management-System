package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanketixiaoshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanketixiaoshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanketixiaoshenView;


/**
 * 科研课题校审
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface KeyanketixiaoshenService extends IService<KeyanketixiaoshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanketixiaoshenVO> selectListVO(Wrapper<KeyanketixiaoshenEntity> wrapper);
   	
   	KeyanketixiaoshenVO selectVO(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
   	
   	List<KeyanketixiaoshenView> selectListView(Wrapper<KeyanketixiaoshenEntity> wrapper);
   	
   	KeyanketixiaoshenView selectView(@Param("ew") Wrapper<KeyanketixiaoshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanketixiaoshenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KeyanketixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KeyanketixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KeyanketixiaoshenEntity> wrapper);
}

