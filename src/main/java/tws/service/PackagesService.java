package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Packages;
import tws.repository.PackagesMapper;

import java.util.List;

@Service
public class PackagesService {
    @Autowired
    private PackagesMapper packagesMapper;

    public void insertOne(Packages packages){
        packages.setState("未取件");
        packages.setTime("");
        packagesMapper.insertOne(packages);
    }
    public List<Packages> queryAll(){
        List<Packages> packages = packagesMapper.queryAll();
        return packages;
    }
}
