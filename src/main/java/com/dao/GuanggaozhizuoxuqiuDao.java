package com.dao;

import com.entity.GuanggaozhizuoxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaozhizuoxuqiuVO;
import com.entity.view.GuanggaozhizuoxuqiuView;


/**
 * 广告制作需求
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaozhizuoxuqiuDao extends BaseMapper<GuanggaozhizuoxuqiuEntity> {
	
	List<GuanggaozhizuoxuqiuVO> selectListVO(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
	
	GuanggaozhizuoxuqiuVO selectVO(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
	
	List<GuanggaozhizuoxuqiuView> selectListView(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);

	List<GuanggaozhizuoxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
	
	GuanggaozhizuoxuqiuView selectView(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
	
}
