package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaotoufangqudaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaotoufangqudaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaotoufangqudaoView;


/**
 * 广告投放渠道
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaotoufangqudaoService extends IService<GuanggaotoufangqudaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaotoufangqudaoVO> selectListVO(Wrapper<GuanggaotoufangqudaoEntity> wrapper);
   	
   	GuanggaotoufangqudaoVO selectVO(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
   	
   	List<GuanggaotoufangqudaoView> selectListView(Wrapper<GuanggaotoufangqudaoEntity> wrapper);
   	
   	GuanggaotoufangqudaoView selectView(@Param("ew") Wrapper<GuanggaotoufangqudaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaotoufangqudaoEntity> wrapper);
   	
}

