package com.dao;

import com.entity.GuanggaoxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoxuqiuVO;
import com.entity.view.GuanggaoxuqiuView;


/**
 * 广告需求
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoxuqiuDao extends BaseMapper<GuanggaoxuqiuEntity> {
	
	List<GuanggaoxuqiuVO> selectListVO(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
	
	GuanggaoxuqiuVO selectVO(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
	
	List<GuanggaoxuqiuView> selectListView(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);

	List<GuanggaoxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
	
	GuanggaoxuqiuView selectView(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
	
}
