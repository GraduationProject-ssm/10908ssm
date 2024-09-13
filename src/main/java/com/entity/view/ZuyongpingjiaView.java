package com.entity.view;

import com.entity.ZuyongpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租用评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-26 19:29:54
 */
@TableName("zuyongpingjia")
public class ZuyongpingjiaView  extends ZuyongpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuyongpingjiaView(){
	}
 
 	public ZuyongpingjiaView(ZuyongpingjiaEntity zuyongpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zuyongpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
