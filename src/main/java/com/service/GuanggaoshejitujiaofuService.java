package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoshejitujiaofuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoshejitujiaofuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoshejitujiaofuView;


/**
 * 广告设计图交付
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshejitujiaofuService extends IService<GuanggaoshejitujiaofuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoshejitujiaofuVO> selectListVO(Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
   	
   	GuanggaoshejitujiaofuVO selectVO(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
   	
   	List<GuanggaoshejitujiaofuView> selectListView(Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
   	
   	GuanggaoshejitujiaofuView selectView(@Param("ew") Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoshejitujiaofuEntity> wrapper);
   	
}

