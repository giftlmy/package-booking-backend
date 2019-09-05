package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Packages;

import java.util.List;

@Mapper
public interface PackagesMapper {
    List<Packages>  queryAll();
    void insertOne(@Param("package") Packages packages);
}
