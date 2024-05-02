package com.dao;

import com.entity.GuanggaozhizuoshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanggaozhizuoshangVO;
import com.entity.view.GuanggaozhizuoshangView;


/**
 * 广告制作商
 * 
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaozhizuoshangDao extends BaseMapper<GuanggaozhizuoshangEntity> {
	
	List<GuanggaozhizuoshangVO> selectListVO(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
	
	GuanggaozhizuoshangVO selectVO(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
	
	List<GuanggaozhizuoshangView> selectListView(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);

	List<GuanggaozhizuoshangView> selectListView(Pagination page,@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
	
	GuanggaozhizuoshangView selectView(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
	
}
