package com.pengdh.entity;

public class DepartEntity {
    private Long departId;

    private String departName;

    private String location;

    private String manager;

    private Integer openpositions;

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Integer getOpenpositions() {
        return openpositions;
    }

    public void setOpenpositions(Integer openpositions) {
        this.openpositions = openpositions;
    }
    @Override
	public String toString() {
		return "DepartEntity [departId=" + departId + ", departName=" + departName + ", location=" + location + ", manager=" + manager + ", openpositions=" + openpositions
				+ "]";
	}
}