package com.dao;

import com.entity.GuanggaotoufangqudaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaotoufangqudaoVO;
import com.entity.view.GuanggaotoufangqudaoView;


/**
 * 广告投放渠道
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaotoufangqudaoDao extends BaseMapper<GuanggaotoufangqudaoEntity> {
	
	List<GuanggaotoufangqudaoVO> selectListVO(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
	
	GuanggaotoufangqudaoVO selectVO(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
	
	List<GuanggaotoufangqudaoView> selectListView(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);

	List<GuanggaotoufangqudaoView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
	
	GuanggaotoufangqudaoView selectView(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
	
}
