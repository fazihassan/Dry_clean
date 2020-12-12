package com.androidfree.myapplication.Model;

public class ServiceType {
    private String serviceName;
    private int serviceImage;

    public ServiceType(String serviceName, int serviceImage) {
        this.serviceName = serviceName;
        this.serviceImage = serviceImage;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(int serviceImage) {
        this.serviceImage = serviceImage;
    }
}
