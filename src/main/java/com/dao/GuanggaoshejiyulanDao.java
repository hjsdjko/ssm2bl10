package com.dao;

import com.entity.GuanggaoshejiyulanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaoshejiyulanVO;
import com.entity.view.GuanggaoshejiyulanView;


/**
 * 广告设计预览
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshejiyulanDao extends BaseMapper<GuanggaoshejiyulanEntity> {
	
	List<GuanggaoshejiyulanVO> selectListVO(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
	
	GuanggaoshejiyulanVO selectVO(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
	
	List<GuanggaoshejiyulanView> selectListView(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);

	List<GuanggaoshejiyulanView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
	
	GuanggaoshejiyulanView selectView(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
	
}
