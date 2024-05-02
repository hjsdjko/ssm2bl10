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


import com.dao.GuanggaodiaozhengxinxiDao;
import com.entity.GuanggaodiaozhengxinxiEntity;
import com.service.GuanggaodiaozhengxinxiService;
import com.entity.vo.GuanggaodiaozhengxinxiVO;
import com.entity.view.GuanggaodiaozhengxinxiView;

@Service("guanggaodiaozhengxinxiService")
public class GuanggaodiaozhengxinxiServiceImpl extends ServiceImpl<GuanggaodiaozhengxinxiDao, GuanggaodiaozhengxinxiEntity> implements GuanggaodiaozhengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaodiaozhengxinxiEntity> page = this.selectPage(
                new Query<GuanggaodiaozhengxinxiEntity>(params).getPage(),
                new EntityWrapper<GuanggaodiaozhengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaodiaozhengxinxiEntity> wrapper) {
		  Page<GuanggaodiaozhengxinxiView> page =new Query<GuanggaodiaozhengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaodiaozhengxinxiVO> selectListVO(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaodiaozhengxinxiVO selectVO(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaodiaozhengxinxiView> selectListView(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaodiaozhengxinxiView selectView(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
