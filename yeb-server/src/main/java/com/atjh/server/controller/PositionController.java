package com.atjh.server.controller;


import com.atjh.server.pojo.Position;
import com.atjh.server.pojo.a.RespBean;
import com.atjh.server.service.IPositionService;
import io.swagger.annotations.ApiModelProperty;
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
@RequestMapping("/system/config/position")
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @ApiModelProperty(value = "获取所有职位信息")
    @GetMapping("/")
    public List<Position> getAllPosition(){
        return positionService.list();
    }

    @ApiModelProperty(value = "添加职位信息")
    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        position.setCreateDate(LocalDateTime.now());
        if (positionService.save(position)) {
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @ApiModelProperty(value = "修改职位信息")
    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updateById(position)) {
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @ApiModelProperty(value = "删除职位信息")
    @DeleteMapping("/{id}")
    public RespBean deletePosition(@PathVariable Integer id){
        if (positionService.removeById(id)) {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @ApiModelProperty(value = "批量删除")
    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if (positionService.removeByIds(Arrays.asList(ids))) {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

}
