package com.dao;

import com.entity.GuanggaoqianshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoqianshuVO;
import com.entity.view.GuanggaoqianshuView;


/**
 * 广告签署
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoqianshuDao extends BaseMapper<GuanggaoqianshuEntity> {
	
	List<GuanggaoqianshuVO> selectListVO(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
	
	GuanggaoqianshuVO selectVO(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
	
	List<GuanggaoqianshuView> selectListView(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);

	List<GuanggaoqianshuView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
	
	GuanggaoqianshuView selectView(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
	
}
