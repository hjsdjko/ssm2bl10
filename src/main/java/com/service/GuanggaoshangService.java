package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoshangView;


/**
 * 广告商
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshangService extends IService<GuanggaoshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoshangVO> selectListVO(Wrapper<GuanggaoshangEntity> wrapper);
   	
   	GuanggaoshangVO selectVO(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
   	
   	List<GuanggaoshangView> selectListView(Wrapper<GuanggaoshangEntity> wrapper);
   	
   	GuanggaoshangView selectView(@Param("ew") Wrapper<GuanggaoshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoshangEntity> wrapper);
   	
}

