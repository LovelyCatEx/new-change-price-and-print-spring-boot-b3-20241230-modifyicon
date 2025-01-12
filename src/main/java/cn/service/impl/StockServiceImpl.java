package cn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.entity.Stock;
import cn.service.StockService;
import cn.mapper.StockMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【stock】的数据库操作Service实现
* @createDate 2025-01-12 00:27:54
*/
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock>
    implements StockService{

}




