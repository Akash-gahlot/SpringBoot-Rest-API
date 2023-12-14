package com.cloud.rest.Service;

import com.cloud.rest.Entity.CloudVendor;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CloudServiceInterface {
    public CloudVendor saveCloudVendor(CloudVendor details);

    public List<CloudVendor> getCloudVendor();

    Optional<CloudVendor> getCloudById(Long Id);

    public CloudVendor updateCloud(Long Id , CloudVendor details);

    public String deleteCloudVendor(Long Id);

    public CloudVendor getByCloudName(String VendorName);
     public List<CloudVendor> getByRating(int Rating);
}
