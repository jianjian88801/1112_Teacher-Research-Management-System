package com.entity.model;

import com.entity.KeyanketiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科研课题
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public class KeyanketiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 科研文件
	 */
	
	private String keyanwenjian;
		
	/**
	 * 成员
	 */
	
	private String chengyuan;
		
	/**
	 * 研究目的
	 */
	
	private String yanjiumude;
		
	/**
	 * 研究内容
	 */
	
	private String yanjiuneirong;
				
	
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
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：科研文件
	 */
	 
	public void setKeyanwenjian(String keyanwenjian) {
		this.keyanwenjian = keyanwenjian;
	}
	
	/**
	 * 获取：科研文件
	 */
	public String getKeyanwenjian() {
		return keyanwenjian;
	}
				
	
	/**
	 * 设置：成员
	 */
	 
	public void setChengyuan(String chengyuan) {
		this.chengyuan = chengyuan;
	}
	
	/**
	 * 获取：成员
	 */
	public String getChengyuan() {
		return chengyuan;
	}
				
	
	/**
	 * 设置：研究目的
	 */
	 
	public void setYanjiumude(String yanjiumude) {
		this.yanjiumude = yanjiumude;
	}
	
	/**
	 * 获取：研究目的
	 */
	public String getYanjiumude() {
		return yanjiumude;
	}
				
	
	/**
	 * 设置：研究内容
	 */
	 
	public void setYanjiuneirong(String yanjiuneirong) {
		this.yanjiuneirong = yanjiuneirong;
	}
	
	/**
	 * 获取：研究内容
	 */
	public String getYanjiuneirong() {
		return yanjiuneirong;
	}
			
}
