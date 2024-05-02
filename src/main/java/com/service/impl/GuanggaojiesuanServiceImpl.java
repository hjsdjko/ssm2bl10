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


import com.dao.GuanggaojiesuanDao;
import com.entity.GuanggaojiesuanEntity;
import com.service.GuanggaojiesuanService;
import com.entity.vo.GuanggaojiesuanVO;
import com.entity.view.GuanggaojiesuanView;

@Service("guanggaojiesuanService")
public class GuanggaojiesuanServiceImpl extends ServiceImpl<GuanggaojiesuanDao, GuanggaojiesuanEntity> implements GuanggaojiesuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaojiesuanEntity> page = this.selectPage(
                new Query<GuanggaojiesuanEntity>(params).getPage(),
                new EntityWrapper<GuanggaojiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaojiesuanEntity> wrapper) {
		  Page<GuanggaojiesuanView> page =new Query<GuanggaojiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaojiesuanVO> selectListVO(Wrapper<GuanggaojiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaojiesuanVO selectVO(Wrapper<GuanggaojiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaojiesuanView> selectListView(Wrapper<GuanggaojiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaojiesuanView selectView(Wrapper<GuanggaojiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
