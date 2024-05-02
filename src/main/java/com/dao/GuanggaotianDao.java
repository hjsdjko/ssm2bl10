package com.dao;

import com.entity.GuanggaotianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaotianVO;
import com.entity.view.GuanggaotianView;


/**
 * 广告提案
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaotianDao extends BaseMapper<GuanggaotianEntity> {
	
	List<GuanggaotianVO> selectListVO(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
	
	GuanggaotianVO selectVO(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
	
	List<GuanggaotianView> selectListView(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);

	List<GuanggaotianView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
	
	GuanggaotianView selectView(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
	
}
