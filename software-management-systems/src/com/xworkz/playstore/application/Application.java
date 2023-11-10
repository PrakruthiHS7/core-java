package com.xworkz.playstore.application;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Application {
    private int appId;
    private String appName;
    private String  appType;
    private String version;
    private String releaseDate;
    private double sizeInMb;
    private String companyName;
}
