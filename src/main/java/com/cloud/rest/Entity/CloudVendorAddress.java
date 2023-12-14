package com.cloud.rest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name="AddressLine1",
                column=@Column(name="Address_Line1")
        ),
        @AttributeOverride(
                name="AddressLine2",
                column = @Column(name="Address_Line2")
        ),
        @AttributeOverride(
                name="City",
                column = @Column(name="City")
        ),
        @AttributeOverride(
                name="State",
                column = @Column(name="State")
        )
})
@Builder
@Data
public class CloudVendorAddress {
    public String AddressLine1;
    public String AddressLine2;
    public String City;
    public String State;
}
