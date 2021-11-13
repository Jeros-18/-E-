package com.atjh.server.controller;


import com.atjh.server.pojo.Joblevel;
import com.atjh.server.pojo.a.RespBean;
import com.atjh.server.service.IJoblevelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jiahui
 * @since 2021-11-06
 */
@RestController
@RequestMapping("/employee/basic/joblevel")
public class JoblevelController {
    @Autowired
    private IJoblevelService joblevelService;

    @ApiOperation(value = "获取所有职称")
    @GetMapping("/")
    public List<Joblevel> getAllJoblevel(){
        return joblevelService.list();
    }

    @ApiOperation(value = "添加职称")
    @PostMapping("/")
    public RespBean addJoblevel(@RequestBody Joblevel joblevel){
        joblevel.setCreateDate(LocalDateTime.now());
        if (joblevelService.save(joblevel)) {
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @ApiOperation(value = "修改职称")
    @PutMapping("/")
    public RespBean updateJoblevel(@RequestBody Joblevel joblevel){
        if (joblevelService.updateById(joblevel)) {
            return RespBean.success("修改成功");
        }
        return RespBean.error("修改失败");
    }

    @ApiOperation(value = "删除职称")
    @DeleteMapping("/{id}")
    public RespBean deleteJoblevel(@PathVariable Integer id){
        if (joblevelService.removeById(id)) {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @ApiOperation(value = "批量删除")
    @DeleteMapping("/")
    public RespBean deleteJoblevelByIds(Integer[] ids){
        if (joblevelService.removeByIds(Arrays.asList(ids))) {
            return RespBean.success("批量删除成功");
        }
        return RespBean.error("批量删除失败");
    }
}
