package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaozhizuoxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaozhizuoxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaozhizuoxuqiuView;


/**
 * 广告制作需求
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaozhizuoxuqiuService extends IService<GuanggaozhizuoxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaozhizuoxuqiuVO> selectListVO(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
   	
   	GuanggaozhizuoxuqiuVO selectVO(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
   	
   	List<GuanggaozhizuoxuqiuView> selectListView(Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
   	
   	GuanggaozhizuoxuqiuView selectView(@Param("ew") Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaozhizuoxuqiuEntity> wrapper);
   	
}

