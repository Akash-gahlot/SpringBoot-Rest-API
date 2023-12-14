package com.cloud.rest.Repository;


import com.cloud.rest.Entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CloudRepo extends JpaRepository<CloudVendor,Long> {
    public CloudVendor findByVendorName(String VendorName);
    public List<CloudVendor> findByRating(int rating);
}
