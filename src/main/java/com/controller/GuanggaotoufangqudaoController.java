package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GuanggaotoufangqudaoEntity;
import com.entity.view.GuanggaotoufangqudaoView;

import com.service.GuanggaotoufangqudaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 广告投放渠道
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@RestController
@RequestMapping("/guanggaotoufangqudao")
public class GuanggaotoufangqudaoController {
    @Autowired
    private GuanggaotoufangqudaoService guanggaotoufangqudaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuanggaotoufangqudaoEntity guanggaotoufangqudao, 
		HttpServletRequest request){

        EntityWrapper<GuanggaotoufangqudaoEntity> ew = new EntityWrapper<GuanggaotoufangqudaoEntity>();
		PageUtils page = guanggaotoufangqudaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guanggaotoufangqudao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuanggaotoufangqudaoEntity guanggaotoufangqudao, 
		HttpServletRequest request){
        EntityWrapper<GuanggaotoufangqudaoEntity> ew = new EntityWrapper<GuanggaotoufangqudaoEntity>();
		PageUtils page = guanggaotoufangqudaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guanggaotoufangqudao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuanggaotoufangqudaoEntity guanggaotoufangqudao){
       	EntityWrapper<GuanggaotoufangqudaoEntity> ew = new EntityWrapper<GuanggaotoufangqudaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guanggaotoufangqudao, "guanggaotoufangqudao")); 
        return R.ok().put("data", guanggaotoufangqudaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuanggaotoufangqudaoEntity guanggaotoufangqudao){
        EntityWrapper< GuanggaotoufangqudaoEntity> ew = new EntityWrapper< GuanggaotoufangqudaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guanggaotoufangqudao, "guanggaotoufangqudao")); 
		GuanggaotoufangqudaoView guanggaotoufangqudaoView =  guanggaotoufangqudaoService.selectView(ew);
		return R.ok("查询广告投放渠道成功").put("data", guanggaotoufangqudaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuanggaotoufangqudaoEntity guanggaotoufangqudao = guanggaotoufangqudaoService.selectById(id);
        return R.ok().put("data", guanggaotoufangqudao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuanggaotoufangqudaoEntity guanggaotoufangqudao = guanggaotoufangqudaoService.selectById(id);
        return R.ok().put("data", guanggaotoufangqudao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuanggaotoufangqudaoEntity guanggaotoufangqudao, HttpServletRequest request){
    	guanggaotoufangqudao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guanggaotoufangqudao);

        guanggaotoufangqudaoService.insert(guanggaotoufangqudao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody GuanggaotoufangqudaoEntity guanggaotoufangqudao, HttpServletRequest request){
    	guanggaotoufangqudao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guanggaotoufangqudao);

        guanggaotoufangqudaoService.insert(guanggaotoufangqudao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GuanggaotoufangqudaoEntity guanggaotoufangqudao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guanggaotoufangqudao);
        guanggaotoufangqudaoService.updateById(guanggaotoufangqudao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guanggaotoufangqudaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GuanggaotoufangqudaoEntity> wrapper = new EntityWrapper<GuanggaotoufangqudaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = guanggaotoufangqudaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
