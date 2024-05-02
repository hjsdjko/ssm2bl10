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


import com.dao.GuanggaoshejitujiaofuDao;
import com.entity.GuanggaoshejitujiaofuEntity;
import com.service.GuanggaoshejitujiaofuService;
import com.entity.vo.GuanggaoshejitujiaofuVO;
import com.entity.view.GuanggaoshejitujiaofuView;

@Service("guanggaoshejitujiaofuService")
public class GuanggaoshejitujiaofuServiceImpl extends ServiceImpl<GuanggaoshejitujiaofuDao, GuanggaoshejitujiaofuEntity> implements GuanggaoshejitujiaofuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoshejitujiaofuEntity> page = this.selectPage(
                new Query<GuanggaoshejitujiaofuEntity>(params).getPage(),
                new EntityWrapper<GuanggaoshejitujiaofuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoshejitujiaofuEntity> wrapper) {
		  Page<GuanggaoshejitujiaofuView> page =new Query<GuanggaoshejitujiaofuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoshejitujiaofuVO> selectListVO(Wrapper<GuanggaoshejitujiaofuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoshejitujiaofuVO selectVO(Wrapper<GuanggaoshejitujiaofuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoshejitujiaofuView> selectListView(Wrapper<GuanggaoshejitujiaofuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoshejitujiaofuView selectView(Wrapper<GuanggaoshejitujiaofuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
