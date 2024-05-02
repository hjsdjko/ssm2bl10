package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaodiaozhengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaodiaozhengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaodiaozhengxinxiView;


/**
 * 广告调整信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaodiaozhengxinxiService extends IService<GuanggaodiaozhengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaodiaozhengxinxiVO> selectListVO(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
   	
   	GuanggaodiaozhengxinxiVO selectVO(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
   	
   	List<GuanggaodiaozhengxinxiView> selectListView(Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
   	
   	GuanggaodiaozhengxinxiView selectView(@Param("ew") Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaodiaozhengxinxiEntity> wrapper);
   	
}

