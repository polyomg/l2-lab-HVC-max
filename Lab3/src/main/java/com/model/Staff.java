package com.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Staff {
    private String id;
    private String fullname;
    @Builder.Default
    private String photo = "meo.jpg";
    @Builder.Default
    private Boolean gender = true;
    @Builder.Default
    private Date birthday = new Date();
    @Builder.Default
    private Double salary = 12345.6789;
    @Builder.Default
    private Integer level = 0;

}
