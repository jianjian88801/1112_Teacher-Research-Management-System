package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 软件著作权
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("ruanjianzhuzuoquan")
public class RuanjianzhuzuoquanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuanjianzhuzuoquanEntity() {
		
	}
	
	public RuanjianzhuzuoquanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 软件名称
	 */
					
	private String ruanjianmingcheng;
	
	/**
	 * 应用类型
	 */
					
	private String yingyongleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 版本
	 */
					
	private String banben;
	
	/**
	 * 文件
	 */
					
	private String wenjian;
	
	/**
	 * 介绍
	 */
					
	private String jieshao;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 版权归属
	 */
					
	private String banquanguishu;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：软件名称
	 */
	public void setRuanjianmingcheng(String ruanjianmingcheng) {
		this.ruanjianmingcheng = ruanjianmingcheng;
	}
	/**
	 * 获取：软件名称
	 */
	public String getRuanjianmingcheng() {
		return ruanjianmingcheng;
	}
	/**
	 * 设置：应用类型
	 */
	public void setYingyongleixing(String yingyongleixing) {
		this.yingyongleixing = yingyongleixing;
	}
	/**
	 * 获取：应用类型
	 */
	public String getYingyongleixing() {
		return yingyongleixing;
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
	 * 设置：版本
	 */
	public void setBanben(String banben) {
		this.banben = banben;
	}
	/**
	 * 获取：版本
	 */
	public String getBanben() {
		return banben;
	}
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
	 * 设置：介绍
	 */
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	/**
	 * 获取：介绍
	 */
	public String getJieshao() {
		return jieshao;
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
	 * 设置：版权归属
	 */
	public void setBanquanguishu(String banquanguishu) {
		this.banquanguishu = banquanguishu;
	}
	/**
	 * 获取：版权归属
	 */
	public String getBanquanguishu() {
		return banquanguishu;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}

}
