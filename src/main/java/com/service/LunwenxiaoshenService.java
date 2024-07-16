package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenxiaoshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenxiaoshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenxiaoshenView;


/**
 * 论文校审
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface LunwenxiaoshenService extends IService<LunwenxiaoshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenxiaoshenVO> selectListVO(Wrapper<LunwenxiaoshenEntity> wrapper);
   	
   	LunwenxiaoshenVO selectVO(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
   	
   	List<LunwenxiaoshenView> selectListView(Wrapper<LunwenxiaoshenEntity> wrapper);
   	
   	LunwenxiaoshenView selectView(@Param("ew") Wrapper<LunwenxiaoshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenxiaoshenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LunwenxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LunwenxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LunwenxiaoshenEntity> wrapper);
}

