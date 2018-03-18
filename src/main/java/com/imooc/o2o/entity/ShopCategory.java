package com.imooc.o2o.entity;

import java.util.Date;

//店铺类别
public class ShopCategory {
	
	//ID
	private Integer shopCategoryId;
	//名称
	private String shopCategoryName;
	//描述
	private String shopCategoryDesc;
	//图片地址
	private String shopCategoryImg;
	//权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//更新时间
	private Date lastEditTime;
	//上级ID
	private ShopCategory paarent;
	public Integer getShopCategoryId() {
		return shopCategoryId;
	}
	public void setShopCategoryId(Integer shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}
	public String getShopCategoryName() {
		return shopCategoryName;
	}
	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}
	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}
	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}
	public String getShopCategoryImg() {
		return shopCategoryImg;
	}
	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public ShopCategory getPaarent() {
		return paarent;
	}
	public void setPaarent(ShopCategory paarent) {
		this.paarent = paarent;
	}
	
	

}
