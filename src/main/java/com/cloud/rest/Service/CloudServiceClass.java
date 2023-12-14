package com.cloud.rest.Service;

import com.cloud.rest.Entity.CloudVendor;
import com.cloud.rest.Entity.CloudVendorAddress;
import com.cloud.rest.Repository.CloudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CloudServiceClass implements CloudServiceInterface {
    @Autowired
    private CloudRepo cloudRepo;

    @Override
    public CloudVendor saveCloudVendor(CloudVendor details){
       return  cloudRepo.save(details);
    }
    @Override
    public List<CloudVendor> getCloudVendor(){
        return cloudRepo.findAll();
    }

//    @Override
//    public Optional<CloudVendor> getCloudById() {
//        return Optional.empty();
//    }

    @Override
    public Optional<CloudVendor> getCloudById(Long Id){
        return cloudRepo.findById(Id);
    }
    @Override
    public CloudVendor updateCloud(Long Id,CloudVendor cloud){
        CloudVendor result=cloudRepo.findById(Id).get();
        if(Objects.nonNull(result.getVendorName()) && !"".equalsIgnoreCase(result.getVendorName())){
            result.setVendorName(cloud.getVendorName());
        }
        if(Objects.nonNull(result.getVendorAddress())){
            result.setVendorAddress(cloud.getVendorAddress());
        }
        if(Objects.nonNull(result.getRating())){
            result.setCloudId((long) cloud.getRating());
        }
        result.setCloudId(result.getCloudId());
            return cloudRepo.save(result);
        }

        @Override
        public String deleteCloudVendor(Long Id){
        cloudRepo.deleteById(Id);
        return "deleted successfully";
        }
        @Override
        public CloudVendor getByCloudName(String CloudName){
        return cloudRepo.findByVendorName(CloudName);
        }

        public List<CloudVendor> getByRating(int rating){
        return cloudRepo.findByRating(rating);
        }
}
