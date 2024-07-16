package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanlixiaoshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanlixiaoshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanlixiaoshenView;


/**
 * 专利校审
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public interface ZhuanlixiaoshenService extends IService<ZhuanlixiaoshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanlixiaoshenVO> selectListVO(Wrapper<ZhuanlixiaoshenEntity> wrapper);
   	
   	ZhuanlixiaoshenVO selectVO(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
   	
   	List<ZhuanlixiaoshenView> selectListView(Wrapper<ZhuanlixiaoshenEntity> wrapper);
   	
   	ZhuanlixiaoshenView selectView(@Param("ew") Wrapper<ZhuanlixiaoshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanlixiaoshenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuanlixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuanlixiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuanlixiaoshenEntity> wrapper);
}

