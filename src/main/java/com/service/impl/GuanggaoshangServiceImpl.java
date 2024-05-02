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


import com.dao.GuanggaoshangDao;
import com.entity.GuanggaoshangEntity;
import com.service.GuanggaoshangService;
import com.entity.vo.GuanggaoshangVO;
import com.entity.view.GuanggaoshangView;

@Service("guanggaoshangService")
public class GuanggaoshangServiceImpl extends ServiceImpl<GuanggaoshangDao, GuanggaoshangEntity> implements GuanggaoshangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoshangEntity> page = this.selectPage(
                new Query<GuanggaoshangEntity>(params).getPage(),
                new EntityWrapper<GuanggaoshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoshangEntity> wrapper) {
		  Page<GuanggaoshangView> page =new Query<GuanggaoshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoshangVO> selectListVO(Wrapper<GuanggaoshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoshangVO selectVO(Wrapper<GuanggaoshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoshangView> selectListView(Wrapper<GuanggaoshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoshangView selectView(Wrapper<GuanggaoshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
