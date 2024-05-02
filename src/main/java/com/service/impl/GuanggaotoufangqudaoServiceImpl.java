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


import com.dao.GuanggaotoufangqudaoDao;
import com.entity.GuanggaotoufangqudaoEntity;
import com.service.GuanggaotoufangqudaoService;
import com.entity.vo.GuanggaotoufangqudaoVO;
import com.entity.view.GuanggaotoufangqudaoView;

@Service("guanggaotoufangqudaoService")
public class GuanggaotoufangqudaoServiceImpl extends ServiceImpl<GuanggaotoufangqudaoDao, GuanggaotoufangqudaoEntity> implements GuanggaotoufangqudaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaotoufangqudaoEntity> page = this.selectPage(
                new Query<GuanggaotoufangqudaoEntity>(params).getPage(),
                new EntityWrapper<GuanggaotoufangqudaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaotoufangqudaoEntity> wrapper) {
		  Page<GuanggaotoufangqudaoView> page =new Query<GuanggaotoufangqudaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaotoufangqudaoVO> selectListVO(Wrapper<GuanggaotoufangqudaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaotoufangqudaoVO selectVO(Wrapper<GuanggaotoufangqudaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaotoufangqudaoView> selectListView(Wrapper<GuanggaotoufangqudaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaotoufangqudaoView selectView(Wrapper<GuanggaotoufangqudaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
