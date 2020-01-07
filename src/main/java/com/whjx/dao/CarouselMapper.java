package com.whjx.dao;

import com.whjx.pojo.Carousel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository("cm")
public interface CarouselMapper {
    Carousel findAll(@Param("id") int id);
}
