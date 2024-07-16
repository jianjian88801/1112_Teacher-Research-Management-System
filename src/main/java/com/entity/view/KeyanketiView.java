package com.entity.view;

import com.entity.KeyanketiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科研课题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("keyanketi")
public class KeyanketiView  extends KeyanketiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyanketiView(){
	}
 
 	public KeyanketiView(KeyanketiEntity keyanketiEntity){
 	try {
			BeanUtils.copyProperties(this, keyanketiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
