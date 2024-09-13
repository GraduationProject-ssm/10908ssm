package com.dao;

import com.entity.ZuyongpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuyongpingjiaVO;
import com.entity.view.ZuyongpingjiaView;


/**
 * 租用评价
 * 
 * @author 
 * @email 
 * @date 2020-12-26 19:29:54
 */
public interface ZuyongpingjiaDao extends BaseMapper<ZuyongpingjiaEntity> {
	
	List<ZuyongpingjiaVO> selectListVO(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
	
	ZuyongpingjiaVO selectVO(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
	
	List<ZuyongpingjiaView> selectListView(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);

	List<ZuyongpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
	
	ZuyongpingjiaView selectView(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
	
}
