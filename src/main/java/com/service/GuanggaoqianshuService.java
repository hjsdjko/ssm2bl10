package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoqianshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoqianshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoqianshuView;


/**
 * 广告签署
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoqianshuService extends IService<GuanggaoqianshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoqianshuVO> selectListVO(Wrapper<GuanggaoqianshuEntity> wrapper);
   	
   	GuanggaoqianshuVO selectVO(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
   	
   	List<GuanggaoqianshuView> selectListView(Wrapper<GuanggaoqianshuEntity> wrapper);
   	
   	GuanggaoqianshuView selectView(@Param("ew") Wrapper<GuanggaoqianshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoqianshuEntity> wrapper);
   	
}

