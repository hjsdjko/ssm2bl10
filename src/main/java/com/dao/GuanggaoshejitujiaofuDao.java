package com.dao;

import com.entity.GuanggaoshejitujiaofuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoshejitujiaofuVO;
import com.entity.view.GuanggaoshejitujiaofuView;


/**
 * 广告设计图交付
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshejitujiaofuDao extends BaseMapper<GuanggaoshejitujiaofuEntity> {
	
	List<GuanggaoshejitujiaofuVO> selectListVO(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
	
	GuanggaoshejitujiaofuVO selectVO(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
	
	List<GuanggaoshejitujiaofuView> selectListView(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);

	List<GuanggaoshejitujiaofuView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
	
	GuanggaoshejitujiaofuView selectView(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
	
}
