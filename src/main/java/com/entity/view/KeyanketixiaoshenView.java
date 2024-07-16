package com.entity.view;

import com.entity.KeyanketixiaoshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科研课题校审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("keyanketixiaoshen")
public class KeyanketixiaoshenView  extends KeyanketixiaoshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyanketixiaoshenView(){
	}
 
 	public KeyanketixiaoshenView(KeyanketixiaoshenEntity keyanketixiaoshenEntity){
 	try {
			BeanUtils.copyProperties(this, keyanketixiaoshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
