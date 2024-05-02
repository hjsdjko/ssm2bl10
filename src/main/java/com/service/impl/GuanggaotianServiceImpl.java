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


import com.dao.GuanggaotianDao;
import com.entity.GuanggaotianEntity;
import com.service.GuanggaotianService;
import com.entity.vo.GuanggaotianVO;
import com.entity.view.GuanggaotianView;

@Service("guanggaotianService")
public class GuanggaotianServiceImpl extends ServiceImpl<GuanggaotianDao, GuanggaotianEntity> implements GuanggaotianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaotianEntity> page = this.selectPage(
                new Query<GuanggaotianEntity>(params).getPage(),
                new EntityWrapper<GuanggaotianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaotianEntity> wrapper) {
		  Page<GuanggaotianView> page =new Query<GuanggaotianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaotianVO> selectListVO(Wrapper<GuanggaotianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaotianVO selectVO(Wrapper<GuanggaotianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaotianView> selectListView(Wrapper<GuanggaotianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaotianView selectView(Wrapper<GuanggaotianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
