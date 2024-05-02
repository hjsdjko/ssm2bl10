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


import com.dao.GuanggaoxuqiuDao;
import com.entity.GuanggaoxuqiuEntity;
import com.service.GuanggaoxuqiuService;
import com.entity.vo.GuanggaoxuqiuVO;
import com.entity.view.GuanggaoxuqiuView;

@Service("guanggaoxuqiuService")
public class GuanggaoxuqiuServiceImpl extends ServiceImpl<GuanggaoxuqiuDao, GuanggaoxuqiuEntity> implements GuanggaoxuqiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaoxuqiuEntity> page = this.selectPage(
                new Query<GuanggaoxuqiuEntity>(params).getPage(),
                new EntityWrapper<GuanggaoxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaoxuqiuEntity> wrapper) {
		  Page<GuanggaoxuqiuView> page =new Query<GuanggaoxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaoxuqiuVO> selectListVO(Wrapper<GuanggaoxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaoxuqiuVO selectVO(Wrapper<GuanggaoxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaoxuqiuView> selectListView(Wrapper<GuanggaoxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaoxuqiuView selectView(Wrapper<GuanggaoxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
