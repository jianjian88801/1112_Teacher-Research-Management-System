package com.entity.model;

import com.entity.KeyanchengguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科研成果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public class KeyanchengguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 成果类型
	 */
	
	private String chengguoleixing;
		
	/**
	 * 成果图片
	 */
	
	private String chengguotupian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 成果详情
	 */
	
	private String chengguoxiangqing;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：成果类型
	 */
	 
	public void setChengguoleixing(String chengguoleixing) {
		this.chengguoleixing = chengguoleixing;
	}
	
	/**
	 * 获取：成果类型
	 */
	public String getChengguoleixing() {
		return chengguoleixing;
	}
				
	
	/**
	 * 设置：成果图片
	 */
	 
	public void setChengguotupian(String chengguotupian) {
		this.chengguotupian = chengguotupian;
	}
	
	/**
	 * 获取：成果图片
	 */
	public String getChengguotupian() {
		return chengguotupian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：成果详情
	 */
	 
	public void setChengguoxiangqing(String chengguoxiangqing) {
		this.chengguoxiangqing = chengguoxiangqing;
	}
	
	/**
	 * 获取：成果详情
	 */
	public String getChengguoxiangqing() {
		return chengguoxiangqing;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
