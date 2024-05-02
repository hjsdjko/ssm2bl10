package com.dao;

import com.entity.GuanggaoshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoshangVO;
import com.entity.view.GuanggaoshangView;


/**
 * 广告商
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshangDao extends BaseMapper<GuanggaoshangEntity> {
	
	List<GuanggaoshangVO> selectListVO(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
	
	GuanggaoshangVO selectVO(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
	
	List<GuanggaoshangView> selectListView(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);

	List<GuanggaoshangView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
	
	GuanggaoshangView selectView(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
	
}
