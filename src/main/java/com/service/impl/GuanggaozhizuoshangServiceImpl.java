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


import com.dao.GuanggaozhizuoshangDao;
import com.entity.GuanggaozhizuoshangEntity;
import com.service.GuanggaozhizuoshangService;
import com.entity.vo.GuanggaozhizuoshangVO;
import com.entity.view.GuanggaozhizuoshangView;

@Service("guanggaozhizuoshangService")
public class GuanggaozhizuoshangServiceImpl extends ServiceImpl<GuanggaozhizuoshangDao, GuanggaozhizuoshangEntity> implements GuanggaozhizuoshangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanggaozhizuoshangEntity> page = this.selectPage(
                new Query<GuanggaozhizuoshangEntity>(params).getPage(),
                new EntityWrapper<GuanggaozhizuoshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanggaozhizuoshangEntity> wrapper) {
		  Page<GuanggaozhizuoshangView> page =new Query<GuanggaozhizuoshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanggaozhizuoshangVO> selectListVO(Wrapper<GuanggaozhizuoshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanggaozhizuoshangVO selectVO(Wrapper<GuanggaozhizuoshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanggaozhizuoshangView> selectListView(Wrapper<GuanggaozhizuoshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanggaozhizuoshangView selectView(Wrapper<GuanggaozhizuoshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
