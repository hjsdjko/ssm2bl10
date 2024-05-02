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


import com.dao.GuanggaoshejiyulanDao;
import com.entity.GuanggaoshejiyulanEntity;
import com.service.GuanggaoshejiyulanService;
import com.entity.vo.GuanggaoshejiyulanVO;
import com.entity.view.GuanggaoshejiyulanView;

@Service("guanggaoshejiyulanService")
public class GuanggaoshejiyulanServiceImpl extends ServiceImpl<GuanggaoshejiyulanDao, GuanggaoshejiyulanEntity> implements GuanggaoshejiyulanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoshejiyulanEntity> page = this.selectPage(
                new Query<GuanggaoshejiyulanEntity>(params).getPage(),
                new EntityWrapper<GuanggaoshejiyulanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoshejiyulanEntity> wrapper) {
		  Page<GuanggaoshejiyulanView> page =new Query<GuanggaoshejiyulanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoshejiyulanVO> selectListVO(Wrapper<GuanggaoshejiyulanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoshejiyulanVO selectVO(Wrapper<GuanggaoshejiyulanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoshejiyulanView> selectListView(Wrapper<GuanggaoshejiyulanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoshejiyulanView selectView(Wrapper<GuanggaoshejiyulanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
