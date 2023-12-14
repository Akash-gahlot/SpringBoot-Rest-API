package com.cloud.rest.Controller;

import com.cloud.rest.Entity.CloudVendor;
import com.cloud.rest.Repository.CloudRepo;
import com.cloud.rest.Service.CloudServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Cloud")
public class CloudVendorController {

    @Autowired
    private CloudServiceClass cloudServiceObj;


    @PostMapping("/saveCloudVendor")
    public CloudVendor saveCloudVendor(@RequestBody CloudVendor obj){
        CloudVendor result=cloudServiceObj.saveCloudVendor(obj);
        System.out.println("obj : "+obj.toString());
        System.out.println(result.toString());
        return result;
    }

    @GetMapping("/getCloudVendor")
    public List<CloudVendor> getCloudVendor(){
        List<CloudVendor> result =  cloudServiceObj.getCloudVendor();
        System.out.println(result);
        return result;
    }

    @GetMapping("/getCloudById/{ID}")
    public Optional<CloudVendor> getCloudById(@PathVariable("ID") Long Id){
        Optional<CloudVendor> result=cloudServiceObj.getCloudById(Id);
        return result;
    }

    @PutMapping("/updateCloud/{ID}")
    public CloudVendor updateCloud(@PathVariable("ID") Long Id, @RequestBody CloudVendor cloud){
        return cloudServiceObj.updateCloud(Id,cloud);
    }
    @DeleteMapping("/deleteCloud/{ID}")
    public String deleteCloudVendor(@PathVariable("ID") Long Id){
         return cloudServiceObj.deleteCloudVendor(Id);
    }

    @GetMapping("/getByCloudName/{name}")
    public CloudVendor getCloudByName(@PathVariable("name") String CloudName){
        System.out.println(CloudName);
        return cloudServiceObj.getByCloudName(CloudName);
    }

    @GetMapping("/getByRating/{rating}")
    public List<CloudVendor> getByRating(@PathVariable("rating") int rating){
        return cloudServiceObj.getByRating(rating);
    }
}
