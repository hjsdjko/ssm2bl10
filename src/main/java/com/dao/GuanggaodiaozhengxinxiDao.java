package com.dao;

import com.entity.GuanggaodiaozhengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaodiaozhengxinxiVO;
import com.entity.view.GuanggaodiaozhengxinxiView;


/**
 * 广告调整信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaodiaozhengxinxiDao extends BaseMapper<GuanggaodiaozhengxinxiEntity> {
	
	List<GuanggaodiaozhengxinxiVO> selectListVO(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
	
	GuanggaodiaozhengxinxiVO selectVO(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
	
	List<GuanggaodiaozhengxinxiView> selectListView(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);

	List<GuanggaodiaozhengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
	
	GuanggaodiaozhengxinxiView selectView(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
	
}
