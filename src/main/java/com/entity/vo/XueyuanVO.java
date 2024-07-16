package com.entity.vo;

import com.entity.XueyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学院
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public class XueyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 学院名称
	 */
	
	private String xueyuanmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 学院地址
	 */
	
	private String xueyuandizhi;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：学院名称
	 */
	 
	public void setXueyuanmingcheng(String xueyuanmingcheng) {
		this.xueyuanmingcheng = xueyuanmingcheng;
	}
	
	/**
	 * 获取：学院名称
	 */
	public String getXueyuanmingcheng() {
		return xueyuanmingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：学院地址
	 */
	 
	public void setXueyuandizhi(String xueyuandizhi) {
		this.xueyuandizhi = xueyuandizhi;
	}
	
	/**
	 * 获取：学院地址
	 */
	public String getXueyuandizhi() {
		return xueyuandizhi;
	}
			
}
