package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuyongpingjiaDao;
import com.entity.ZuyongpingjiaEntity;
import com.service.ZuyongpingjiaService;
import com.entity.vo.ZuyongpingjiaVO;
import com.entity.view.ZuyongpingjiaView;

@Service("zuyongpingjiaService")
public class ZuyongpingjiaServiceImpl extends ServiceImpl<ZuyongpingjiaDao, ZuyongpingjiaEntity> implements ZuyongpingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuyongpingjiaEntity> page = this.selectPage(
                new Query<ZuyongpingjiaEntity>(params).getPage(),
                new EntityWrapper<ZuyongpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuyongpingjiaEntity> wrapper) {
		  Page<ZuyongpingjiaView> page =new Query<ZuyongpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuyongpingjiaVO> selectListVO(Wrapper<ZuyongpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuyongpingjiaVO selectVO(Wrapper<ZuyongpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuyongpingjiaView> selectListView(Wrapper<ZuyongpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuyongpingjiaView selectView(Wrapper<ZuyongpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
