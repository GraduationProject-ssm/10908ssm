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
 * 车位退租
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-26 19:29:54
 */
@TableName("cheweituizu")
public class CheweituizuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheweituizuEntity() {
		
	}
	
	public CheweituizuEntity(T t) {
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
	 * 租用编号
	 */
					
	private String zuyongbianhao;
	
	/**
	 * 车位编号
	 */
					
	private String cheweibianhao;
	
	/**
	 * 停放时价
	 */
					
	private Integer tingfangshijia;
	
	/**
	 * 进场时间
	 */
					
	private String jinchangshijian;
	
	/**
	 * 离开时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date likaishijian;
	
	/**
	 * 停车时长
	 */
					
	private Integer tingcheshizhang;
	
	/**
	 * 租用金额
	 */
					
	private String zuyongjine;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：租用编号
	 */
	public void setZuyongbianhao(String zuyongbianhao) {
		this.zuyongbianhao = zuyongbianhao;
	}
	/**
	 * 获取：租用编号
	 */
	public String getZuyongbianhao() {
		return zuyongbianhao;
	}
	/**
	 * 设置：车位编号
	 */
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
	/**
	 * 设置：停放时价
	 */
	public void setTingfangshijia(Integer tingfangshijia) {
		this.tingfangshijia = tingfangshijia;
	}
	/**
	 * 获取：停放时价
	 */
	public Integer getTingfangshijia() {
		return tingfangshijia;
	}
	/**
	 * 设置：进场时间
	 */
	public void setJinchangshijian(String jinchangshijian) {
		this.jinchangshijian = jinchangshijian;
	}
	/**
	 * 获取：进场时间
	 */
	public String getJinchangshijian() {
		return jinchangshijian;
	}
	/**
	 * 设置：离开时间
	 */
	public void setLikaishijian(Date likaishijian) {
		this.likaishijian = likaishijian;
	}
	/**
	 * 获取：离开时间
	 */
	public Date getLikaishijian() {
		return likaishijian;
	}
	/**
	 * 设置：停车时长
	 */
	public void setTingcheshizhang(Integer tingcheshizhang) {
		this.tingcheshizhang = tingcheshizhang;
	}
	/**
	 * 获取：停车时长
	 */
	public Integer getTingcheshizhang() {
		return tingcheshizhang;
	}
	/**
	 * 设置：租用金额
	 */
	public void setZuyongjine(String zuyongjine) {
		this.zuyongjine = zuyongjine;
	}
	/**
	 * 获取：租用金额
	 */
	public String getZuyongjine() {
		return zuyongjine;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
