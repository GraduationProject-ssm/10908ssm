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
 * 租用评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-26 19:29:54
 */
@TableName("zuyongpingjia")
public class ZuyongpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuyongpingjiaEntity() {
		
	}
	
	public ZuyongpingjiaEntity(T t) {
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
	 * 评分
	 */
					
	private String pingfen;
	
	/**
	 * 整体评价
	 */
					
	private String zhengtipingjia;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	
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
	 * 设置：评分
	 */
	public void setPingfen(String pingfen) {
		this.pingfen = pingfen;
	}
	/**
	 * 获取：评分
	 */
	public String getPingfen() {
		return pingfen;
	}
	/**
	 * 设置：整体评价
	 */
	public void setZhengtipingjia(String zhengtipingjia) {
		this.zhengtipingjia = zhengtipingjia;
	}
	/**
	 * 获取：整体评价
	 */
	public String getZhengtipingjia() {
		return zhengtipingjia;
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

}
