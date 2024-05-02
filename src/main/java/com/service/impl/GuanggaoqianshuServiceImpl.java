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


import com.dao.GuanggaoqianshuDao;
import com.entity.GuanggaoqianshuEntity;
import com.service.GuanggaoqianshuService;
import com.entity.vo.GuanggaoqianshuVO;
import com.entity.view.GuanggaoqianshuView;

@Service("guanggaoqianshuService")
public class GuanggaoqianshuServiceImpl extends ServiceImpl<GuanggaoqianshuDao, GuanggaoqianshuEntity> implements GuanggaoqianshuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoqianshuEntity> page = this.selectPage(
                new Query<GuanggaoqianshuEntity>(params).getPage(),
                new EntityWrapper<GuanggaoqianshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoqianshuEntity> wrapper) {
		  Page<GuanggaoqianshuView> page =new Query<GuanggaoqianshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoqianshuVO> selectListVO(Wrapper<GuanggaoqianshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoqianshuVO selectVO(Wrapper<GuanggaoqianshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoqianshuView> selectListView(Wrapper<GuanggaoqianshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoqianshuView selectView(Wrapper<GuanggaoqianshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
