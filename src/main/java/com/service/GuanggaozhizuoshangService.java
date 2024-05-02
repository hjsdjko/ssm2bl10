package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaozhizuoshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaozhizuoshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaozhizuoshangView;


/**
 * 广告制作商
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaozhizuoshangService extends IService<GuanggaozhizuoshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaozhizuoshangVO> selectListVO(Wrapper<GuanggaozhizuoshangEntity> wrapper);
   	
   	GuanggaozhizuoshangVO selectVO(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
   	
   	List<GuanggaozhizuoshangView> selectListView(Wrapper<GuanggaozhizuoshangEntity> wrapper);
   	
   	GuanggaozhizuoshangView selectView(@Param("ew") Wrapper<GuanggaozhizuoshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaozhizuoshangEntity> wrapper);
   	
}

