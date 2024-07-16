package com.entity.vo;

import com.entity.KeyanketixiaoshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科研课题校审
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
public class KeyanketixiaoshenVO  implements Serializable {
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
	 * 审核情况
	 */
	
	private String shenheqingkuang;
		
	/**
	 * 审核状态
	 */
	
	private String shenhezhuangtai;
		
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
