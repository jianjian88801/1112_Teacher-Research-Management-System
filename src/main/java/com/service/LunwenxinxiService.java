package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenxinxiView;


/**
 * 论文信息
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface LunwenxinxiService extends IService<LunwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenxinxiVO> selectListVO(Wrapper<LunwenxinxiEntity> wrapper);
   	
   	LunwenxinxiVO selectVO(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
   	
   	List<LunwenxinxiView> selectListView(Wrapper<LunwenxinxiEntity> wrapper);
   	
   	LunwenxinxiView selectView(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LunwenxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LunwenxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LunwenxinxiEntity> wrapper);
}

