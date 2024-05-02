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

import com.entity.GuanggaozhizuoxuqiuEntity;
import com.entity.view.GuanggaozhizuoxuqiuView;

import com.service.GuanggaozhizuoxuqiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 广告制作需求
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@RestController
@RequestMapping("/guanggaozhizuoxuqiu")
public class GuanggaozhizuoxuqiuController {
    @Autowired
    private GuanggaozhizuoxuqiuService guanggaozhizuoxuqiuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("guanggaoshang")) {
			guanggaozhizuoxuqiu.setGuanggaoshangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuanggaozhizuoxuqiuEntity> ew = new EntityWrapper<GuanggaozhizuoxuqiuEntity>();
		PageUtils page = guanggaozhizuoxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guanggaozhizuoxuqiu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("guanggaoshang")) {
			guanggaozhizuoxuqiu.setGuanggaoshangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuanggaozhizuoxuqiuEntity> ew = new EntityWrapper<GuanggaozhizuoxuqiuEntity>();
		PageUtils page = guanggaozhizuoxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guanggaozhizuoxuqiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu){
       	EntityWrapper<GuanggaozhizuoxuqiuEntity> ew = new EntityWrapper<GuanggaozhizuoxuqiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guanggaozhizuoxuqiu, "guanggaozhizuoxuqiu")); 
        return R.ok().put("data", guanggaozhizuoxuqiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu){
        EntityWrapper< GuanggaozhizuoxuqiuEntity> ew = new EntityWrapper< GuanggaozhizuoxuqiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guanggaozhizuoxuqiu, "guanggaozhizuoxuqiu")); 
		GuanggaozhizuoxuqiuView guanggaozhizuoxuqiuView =  guanggaozhizuoxuqiuService.selectView(ew);
		return R.ok("查询广告制作需求成功").put("data", guanggaozhizuoxuqiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu = guanggaozhizuoxuqiuService.selectById(id);
        return R.ok().put("data", guanggaozhizuoxuqiu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu = guanggaozhizuoxuqiuService.selectById(id);
        return R.ok().put("data", guanggaozhizuoxuqiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu, HttpServletRequest request){
    	guanggaozhizuoxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guanggaozhizuoxuqiu);

        guanggaozhizuoxuqiuService.insert(guanggaozhizuoxuqiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu, HttpServletRequest request){
    	guanggaozhizuoxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guanggaozhizuoxuqiu);
    	guanggaozhizuoxuqiu.setUserid((Long)request.getSession().getAttribute("userId"));

        guanggaozhizuoxuqiuService.insert(guanggaozhizuoxuqiu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GuanggaozhizuoxuqiuEntity guanggaozhizuoxuqiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guanggaozhizuoxuqiu);
        guanggaozhizuoxuqiuService.updateById(guanggaozhizuoxuqiu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guanggaozhizuoxuqiuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GuanggaozhizuoxuqiuEntity> wrapper = new EntityWrapper<GuanggaozhizuoxuqiuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("guanggaoshang")) {
			wrapper.eq("guanggaoshangzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = guanggaozhizuoxuqiuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
