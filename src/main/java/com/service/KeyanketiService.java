package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanketiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanketiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanketiView;


/**
 * 科研课题
 *
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public interface KeyanketiService extends IService<KeyanketiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanketiVO> selectListVO(Wrapper<KeyanketiEntity> wrapper);
   	
   	KeyanketiVO selectVO(@Param("ew") Wrapper<KeyanketiEntity> wrapper);
   	
   	List<KeyanketiView> selectListView(Wrapper<KeyanketiEntity> wrapper);
   	
   	KeyanketiView selectView(@Param("ew") Wrapper<KeyanketiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanketiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KeyanketiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KeyanketiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KeyanketiEntity> wrapper);
}

