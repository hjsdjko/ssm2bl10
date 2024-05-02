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


import com.dao.GuanggaozhizuoxuqiuDao;
import com.entity.GuanggaozhizuoxuqiuEntity;
import com.service.GuanggaozhizuoxuqiuService;
import com.entity.vo.GuanggaozhizuoxuqiuVO;
import com.entity.view.GuanggaozhizuoxuqiuView;

@Service("guanggaozhizuoxuqiuService")
public class GuanggaozhizuoxuqiuServiceImpl extends ServiceImpl<GuanggaozhizuoxuqiuDao, GuanggaozhizuoxuqiuEntity> implements GuanggaozhizuoxuqiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaozhizuoxuqiuEntity> page = this.selectPage(
                new Query<GuanggaozhizuoxuqiuEntity>(params).getPage(),
                new EntityWrapper<GuanggaozhizuoxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaozhizuoxuqiuEntity> wrapper) {
		  Page<GuanggaozhizuoxuqiuView> page =new Query<GuanggaozhizuoxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaozhizuoxuqiuVO> selectListVO(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaozhizuoxuqiuVO selectVO(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaozhizuoxuqiuView> selectListView(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaozhizuoxuqiuView selectView(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
