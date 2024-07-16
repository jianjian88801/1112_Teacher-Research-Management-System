package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuzuoquanxiaoshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuzuoquanxiaoshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuzuoquanxiaoshenView;


/**
 * 著作权校审
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface ZhuzuoquanxiaoshenService extends IService<ZhuzuoquanxiaoshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuzuoquanxiaoshenVO> selectListVO(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
   	
   	ZhuzuoquanxiaoshenVO selectVO(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
   	
   	List<ZhuzuoquanxiaoshenView> selectListView(Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
   	
   	ZhuzuoquanxiaoshenView selectView(@Param("ew") Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhuzuoquanxiaoshenEntity> wrapper);
}

