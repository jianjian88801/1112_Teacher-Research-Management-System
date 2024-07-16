package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuanjianzhuzuoquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuanjianzhuzuoquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuanjianzhuzuoquanView;


/**
 * 软件著作权
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface RuanjianzhuzuoquanService extends IService<RuanjianzhuzuoquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuanjianzhuzuoquanVO> selectListVO(Wrapper<RuanjianzhuzuoquanEntity> wrapper);
   	
   	RuanjianzhuzuoquanVO selectVO(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
   	
   	List<RuanjianzhuzuoquanView> selectListView(Wrapper<RuanjianzhuzuoquanEntity> wrapper);
   	
   	RuanjianzhuzuoquanView selectView(@Param("ew") Wrapper<RuanjianzhuzuoquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuanjianzhuzuoquanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RuanjianzhuzuoquanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RuanjianzhuzuoquanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RuanjianzhuzuoquanEntity> wrapper);
}

