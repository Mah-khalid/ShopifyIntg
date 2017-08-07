package com.app.db;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
	private String position;
	
	private Long id;

	private String height;

	private String updated_at;

	private String product_id;

	private String width;

	private String created_at;

	private String src;

	private List<String> variant_ids;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public List<String> getVariant_ids() {
		return variant_ids;
	}

	public void setVariant_ids(List<String> variant_ids) {
		this.variant_ids = variant_ids;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Image [position=").append(position).append(", id=").append(id)
				.append(", height=").append(height).append(", updated_at=").append(updated_at).append(", product_id=")
				.append(product_id).append(", width=").append(width).append(", created_at=").append(created_at)
				.append(", src=").append(src).append(", variant_ids=").append(variant_ids).append("]");
		return builder.toString();
	}

}