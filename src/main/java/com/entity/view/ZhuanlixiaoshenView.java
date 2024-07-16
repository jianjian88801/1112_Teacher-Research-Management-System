package com.entity.view;

import com.entity.ZhuanlixiaoshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专利校审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
@TableName("zhuanlixiaoshen")
public class ZhuanlixiaoshenView  extends ZhuanlixiaoshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanlixiaoshenView(){
	}
 
 	public ZhuanlixiaoshenView(ZhuanlixiaoshenEntity zhuanlixiaoshenEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanlixiaoshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
