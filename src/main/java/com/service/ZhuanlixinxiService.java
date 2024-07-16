package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanlixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanlixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanlixinxiView;


/**
 * 专利信息
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface ZhuanlixinxiService extends IService<ZhuanlixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanlixinxiVO> selectListVO(Wrapper<ZhuanlixinxiEntity> wrapper);
   	
   	ZhuanlixinxiVO selectVO(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
   	
   	List<ZhuanlixinxiView> selectListView(Wrapper<ZhuanlixinxiEntity> wrapper);
   	
   	ZhuanlixinxiView selectView(@Param("ew") Wrapper<ZhuanlixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanlixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuanlixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuanlixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuanlixinxiEntity> wrapper);
}

