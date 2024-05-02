package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoxuqiuView;


/**
 * 广告需求
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoxuqiuService extends IService<GuanggaoxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoxuqiuVO> selectListVO(Wrapper<GuanggaoxuqiuEntity> wrapper);
   	
   	GuanggaoxuqiuVO selectVO(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
   	
   	List<GuanggaoxuqiuView> selectListView(Wrapper<GuanggaoxuqiuEntity> wrapper);
   	
   	GuanggaoxuqiuView selectView(@Param("ew") Wrapper<GuanggaoxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoxuqiuEntity> wrapper);
   	
}

