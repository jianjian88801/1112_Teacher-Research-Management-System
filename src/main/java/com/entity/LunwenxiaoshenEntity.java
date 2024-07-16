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
 * 论文校审
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 10:50:00
 */
@TableName("lunwenxiaoshen")
public class LunwenxiaoshenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LunwenxiaoshenEntity() {
		
	}
	
	public LunwenxiaoshenEntity(T t) {
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
	 * 论文题目
	 */
					
	private String lunwentimu;
	
	/**
	 * 论文类型
	 */
					
	private String lunwenleixing;
	
	/**
	 * 论文副标题
	 */
					
	private String lunwenfubiaoti;
	
	/**
	 * 作者署名
	 */
					
	private String zuozheshuming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 时间
	 */
					
	private String shijian;
	
	/**
	 * 论文文件
	 */
					
	private String lunwenwenjian;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
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
	 * 设置：论文题目
	 */
	public void setLunwentimu(String lunwentimu) {
		this.lunwentimu = lunwentimu;
	}
	/**
	 * 获取：论文题目
	 */
	public String getLunwentimu() {
		return lunwentimu;
	}
	/**
	 * 设置：论文类型
	 */
	public void setLunwenleixing(String lunwenleixing) {
		this.lunwenleixing = lunwenleixing;
	}
	/**
	 * 获取：论文类型
	 */
	public String getLunwenleixing() {
		return lunwenleixing;
	}
	/**
	 * 设置：论文副标题
	 */
	public void setLunwenfubiaoti(String lunwenfubiaoti) {
		this.lunwenfubiaoti = lunwenfubiaoti;
	}
	/**
	 * 获取：论文副标题
	 */
	public String getLunwenfubiaoti() {
		return lunwenfubiaoti;
	}
	/**
	 * 设置：作者署名
	 */
	public void setZuozheshuming(String zuozheshuming) {
		this.zuozheshuming = zuozheshuming;
	}
	/**
	 * 获取：作者署名
	 */
	public String getZuozheshuming() {
		return zuozheshuming;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：时间
	 */
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public String getShijian() {
		return shijian;
	}
	/**
	 * 设置：论文文件
	 */
	public void setLunwenwenjian(String lunwenwenjian) {
		this.lunwenwenjian = lunwenwenjian;
	}
	/**
	 * 获取：论文文件
	 */
	public String getLunwenwenjian() {
		return lunwenwenjian;
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
