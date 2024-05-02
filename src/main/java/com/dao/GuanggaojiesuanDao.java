package com.dao;

import com.entity.GuanggaojiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaojiesuanVO;
import com.entity.view.GuanggaojiesuanView;


/**
 * 广告结算
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaojiesuanDao extends BaseMapper<GuanggaojiesuanEntity> {
	
	List<GuanggaojiesuanVO> selectListVO(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
	
	GuanggaojiesuanVO selectVO(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
	
	List<GuanggaojiesuanView> selectListView(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);

	List<GuanggaojiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
	
	GuanggaojiesuanView selectView(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
	
}
