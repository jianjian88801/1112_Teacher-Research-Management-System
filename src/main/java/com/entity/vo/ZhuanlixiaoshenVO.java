package com.entity.vo;

import com.entity.ZhuanlixiaoshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 专利校审
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:01
 */
public class ZhuanlixiaoshenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 专利名称
	 */
	
	private String zhuanlimingcheng;
		
	/**
	 * 专利类型
	 */
	
	private String zhuanlileixing;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 审核时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenheshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：专利名称
	 */
	 
	public void setZhuanlimingcheng(String zhuanlimingcheng) {
		this.zhuanlimingcheng = zhuanlimingcheng;
	}
	
	/**
	 * 获取：专利名称
	 */
	public String getZhuanlimingcheng() {
		return zhuanlimingcheng;
	}
				
	
	/**
	 * 设置：专利类型
	 */
	 
	public void setZhuanlileixing(String zhuanlileixing) {
		this.zhuanlileixing = zhuanlileixing;
	}
	
	/**
	 * 获取：专利类型
	 */
	public String getZhuanlileixing() {
		return zhuanlileixing;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：审核时间
	 */
	 
	public void setShenheshijian(Date shenheshijian) {
		this.shenheshijian = shenheshijian;
	}
	
	/**
	 * 获取：审核时间
	 */
	public Date getShenheshijian() {
		return shenheshijian;
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
