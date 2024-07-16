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
 * 科研成果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("keyanchengguo")
public class KeyanchengguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeyanchengguoEntity() {
		
	}
	
	public KeyanchengguoEntity(T t) {
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
	 * 成果名称
	 */
					
	private String chengguomingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：成果名称
	 */
	public void setChengguomingcheng(String chengguomingcheng) {
		this.chengguomingcheng = chengguomingcheng;
	}
	/**
	 * 获取：成果名称
	 */
	public String getChengguomingcheng() {
		return chengguomingcheng;
	}
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
