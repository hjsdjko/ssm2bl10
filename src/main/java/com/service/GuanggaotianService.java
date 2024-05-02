package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaotianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaotianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaotianView;


/**
 * 广告提案
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaotianService extends IService<GuanggaotianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaotianVO> selectListVO(Wrapper<GuanggaotianEntity> wrapper);
   	
   	GuanggaotianVO selectVO(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
   	
   	List<GuanggaotianView> selectListView(Wrapper<GuanggaotianEntity> wrapper);
   	
   	GuanggaotianView selectView(@Param("ew") Wrapper<GuanggaotianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaotianEntity> wrapper);
   	
}

