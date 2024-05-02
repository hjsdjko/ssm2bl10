package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaojiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaojiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaojiesuanView;


/**
 * 广告结算
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaojiesuanService extends IService<GuanggaojiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaojiesuanVO> selectListVO(Wrapper<GuanggaojiesuanEntity> wrapper);
   	
   	GuanggaojiesuanVO selectVO(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
   	
   	List<GuanggaojiesuanView> selectListView(Wrapper<GuanggaojiesuanEntity> wrapper);
   	
   	GuanggaojiesuanView selectView(@Param("ew") Wrapper<GuanggaojiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaojiesuanEntity> wrapper);
   	
}

