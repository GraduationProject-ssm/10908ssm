package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuyongpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuyongpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuyongpingjiaView;


/**
 * 租用评价
 *
 * @author 
 * @email 
 * @date 2020-12-26 19:29:54
 */
public interface ZuyongpingjiaService extends IService<ZuyongpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuyongpingjiaVO> selectListVO(Wrapper<ZuyongpingjiaEntity> wrapper);
   	
   	ZuyongpingjiaVO selectVO(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
   	
   	List<ZuyongpingjiaView> selectListView(Wrapper<ZuyongpingjiaEntity> wrapper);
   	
   	ZuyongpingjiaView selectView(@Param("ew") Wrapper<ZuyongpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuyongpingjiaEntity> wrapper);
   	
}

