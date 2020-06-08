package com.kafka.model;

public class CustomObject {

	private int customObjectId;
	private String customObjectName;
	private String partitionName;
	public int getCustomObjectId() {
		return customObjectId;
	}
	public void setCustomObjectId(int customObjectId) {
		this.customObjectId = customObjectId;
	}
	public String getCustomObjectName() {
		return customObjectName;
	}
	public void setCustomObjectName(String customObjectName) {
		this.customObjectName = customObjectName;
	}
	public String getPartitionName() {
		return partitionName;
	}
	public void setPartitionName(String partitionName) {
		this.partitionName = partitionName;
	}
	
}
