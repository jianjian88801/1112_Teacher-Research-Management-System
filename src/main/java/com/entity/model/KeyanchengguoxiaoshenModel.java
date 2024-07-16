package com.entity.model;

import com.entity.KeyanchengguoxiaoshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科研成果校审
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public class KeyanchengguoxiaoshenModel  implements Serializable {
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
	 * 审核状态
	 */
	
	private String shenhezhuangtai;
		
	/**
	 * 审核情况
	 */
	
	private String shenheqingkuang;
		
	/**
	 * 学院账号
	 */
	
	private String xueyuanzhanghao;
		
	/**
	 * 学院名称
	 */
	
	private String xueyuanmingcheng;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
				
	
	/**
	 * 设置：审核状态
	 */
	 
	public void setShenhezhuangtai(String shenhezhuangtai) {
		this.shenhezhuangtai = shenhezhuangtai;
	}
	
	/**
	 * 获取：审核状态
	 */
	public String getShenhezhuangtai() {
		return shenhezhuangtai;
	}
				
	
	/**
	 * 设置：审核情况
	 */
	 
	public void setShenheqingkuang(String shenheqingkuang) {
		this.shenheqingkuang = shenheqingkuang;
	}
	
	/**
	 * 获取：审核情况
	 */
	public String getShenheqingkuang() {
		return shenheqingkuang;
	}
				
	
	/**
	 * 设置：学院账号
	 */
	 
	public void setXueyuanzhanghao(String xueyuanzhanghao) {
		this.xueyuanzhanghao = xueyuanzhanghao;
	}
	
	/**
	 * 获取：学院账号
	 */
	public String getXueyuanzhanghao() {
		return xueyuanzhanghao;
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
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
