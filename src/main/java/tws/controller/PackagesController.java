package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tws.entity.Packages;
import tws.service.PackagesService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packages")
@CrossOrigin("*")
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @GetMapping("")
    public ResponseEntity<List<Packages>> getAll() {
        return ResponseEntity.ok(packagesService.queryAll());
    }
    @PostMapping("")
    public ResponseEntity<Packages> insert(@RequestBody Packages packages) {
        packagesService.insertOne(packages);
        return ResponseEntity.created(URI.create("/packages/" + packages.getNumid())).body(packages);
    }
}
