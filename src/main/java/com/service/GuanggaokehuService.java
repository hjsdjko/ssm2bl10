package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaokehuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaokehuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaokehuView;


/**
 * 广告客户
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaokehuService extends IService<GuanggaokehuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaokehuVO> selectListVO(Wrapper<GuanggaokehuEntity> wrapper);
   	
   	GuanggaokehuVO selectVO(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
   	
   	List<GuanggaokehuView> selectListView(Wrapper<GuanggaokehuEntity> wrapper);
   	
   	GuanggaokehuView selectView(@Param("ew") Wrapper<GuanggaokehuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaokehuEntity> wrapper);
   	
}

