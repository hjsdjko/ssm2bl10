package com.dao;

import com.entity.GuanggaokehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaokehuVO;
import com.entity.view.GuanggaokehuView;


/**
 * 广告客户
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaokehuDao extends BaseMapper<GuanggaokehuEntity> {
	
	List<GuanggaokehuVO> selectListVO(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
	
	GuanggaokehuVO selectVO(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
	
	List<GuanggaokehuView> selectListView(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);

	List<GuanggaokehuView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
	
	GuanggaokehuView selectView(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
	
}
