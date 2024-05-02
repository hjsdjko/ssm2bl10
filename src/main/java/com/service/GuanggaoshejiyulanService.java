package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanggaoshejiyulanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanggaoshejiyulanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanggaoshejiyulanView;


/**
 * 广告设计预览
 *
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
public interface GuanggaoshejiyulanService extends IService<GuanggaoshejiyulanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoshejiyulanVO> selectListVO(Wrapper<GuanggaoshejiyulanEntity> wrapper);
   	
   	GuanggaoshejiyulanVO selectVO(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
   	
   	List<GuanggaoshejiyulanView> selectListView(Wrapper<GuanggaoshejiyulanEntity> wrapper);
   	
   	GuanggaoshejiyulanView selectView(@Param("ew") Wrapper<GuanggaoshejiyulanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoshejiyulanEntity> wrapper);
   	
}

