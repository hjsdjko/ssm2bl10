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


import com.dao.GuanggaokehuDao;
import com.entity.GuanggaokehuEntity;
import com.service.GuanggaokehuService;
import com.entity.vo.GuanggaokehuVO;
import com.entity.view.GuanggaokehuView;

@Service("guanggaokehuService")
public class GuanggaokehuServiceImpl extends ServiceImpl<GuanggaokehuDao, GuanggaokehuEntity> implements GuanggaokehuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaokehuEntity> page = this.selectPage(
                new Query<GuanggaokehuEntity>(params).getPage(),
                new EntityWrapper<GuanggaokehuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaokehuEntity> wrapper) {
		  Page<GuanggaokehuView> page =new Query<GuanggaokehuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaokehuVO> selectListVO(Wrapper<GuanggaokehuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaokehuVO selectVO(Wrapper<GuanggaokehuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaokehuView> selectListView(Wrapper<GuanggaokehuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaokehuView selectView(Wrapper<GuanggaokehuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
