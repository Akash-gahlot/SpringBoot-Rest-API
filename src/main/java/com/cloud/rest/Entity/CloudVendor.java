package com.cloud.rest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Sequence;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "Cloud_Vendors"
)
@Builder
@Data
public class CloudVendor {
    @Id
    @SequenceGenerator(
            name="CloudId_Generator",
            sequenceName = "CloudId_Generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CloudId_Generator"
    )
    public Long CloudId;
    @Column(
            name = "Vendor_Name"
    )
    public String vendorName;

    @Embedded
    public CloudVendorAddress VendorAddress;

    @Column(
            name="Rating"
    )
    public int rating;


}
