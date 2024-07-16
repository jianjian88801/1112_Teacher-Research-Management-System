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
 * 科研课题
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("keyanketi")
public class KeyanketiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeyanketiEntity() {
		
	}
	
	public KeyanketiEntity(T t) {
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
	 * 课题名称
	 */
					
	private String ketimingcheng;
	
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
	 * 设置：课题名称
	 */
	public void setKetimingcheng(String ketimingcheng) {
		this.ketimingcheng = ketimingcheng;
	}
	/**
	 * 获取：课题名称
	 */
	public String getKetimingcheng() {
		return ketimingcheng;
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
