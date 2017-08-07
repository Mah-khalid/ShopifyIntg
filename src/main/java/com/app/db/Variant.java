package com.app.db;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Variant
{
    private String position;

    private String weight;

    private String product_id;

    private String taxable;

    private String inventory_policy;

    private String barcode;

    private String weight_unit;

    private String sku;

    private String fulfillment_service;
    
    private String image_id;
    
    private Long id;

    private String option1;

    private String option2;

    private String option3;

    private String title;

    private String updated_at;

    private String price;

    private String requires_shipping;

    private String old_inventory_quantity;

    private String created_at;

    private String grams;

    private String inventory_management;

    private String compare_at_price;

    private String inventory_quantity;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getTaxable ()
    {
        return taxable;
    }

    public void setTaxable (String taxable)
    {
        this.taxable = taxable;
    }

    public String getInventory_policy ()
    {
        return inventory_policy;
    }

    public void setInventory_policy (String inventory_policy)
    {
        this.inventory_policy = inventory_policy;
    }

    public String getBarcode ()
    {
        return barcode;
    }

    public void setBarcode (String barcode)
    {
        this.barcode = barcode;
    }

    public String getWeight_unit ()
    {
        return weight_unit;
    }

    public void setWeight_unit (String weight_unit)
    {
        this.weight_unit = weight_unit;
    }

    public String getSku ()
    {
        return sku;
    }

    public void setSku (String sku)
    {
        this.sku = sku;
    }

    public String getFulfillment_service ()
    {
        return fulfillment_service;
    }

    public void setFulfillment_service (String fulfillment_service)
    {
        this.fulfillment_service = fulfillment_service;
    }

    public String getImage_id ()
    {
        return image_id;
    }

    public void setImage_id (String image_id)
    {
        this.image_id = image_id;
    }

    public String getOption1 ()
    {
        return option1;
    }

    public void setOption1 (String option1)
    {
        this.option1 = option1;
    }

    public String getOption2 ()
    {
        return option2;
    }

    public void setOption2 (String option2)
    {
        this.option2 = option2;
    }

    public String getOption3 ()
    {
        return option3;
    }

    public void setOption3 (String option3)
    {
        this.option3 = option3;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getRequires_shipping ()
    {
        return requires_shipping;
    }

    public void setRequires_shipping (String requires_shipping)
    {
        this.requires_shipping = requires_shipping;
    }

    public String getOld_inventory_quantity ()
    {
        return old_inventory_quantity;
    }

    public void setOld_inventory_quantity (String old_inventory_quantity)
    {
        this.old_inventory_quantity = old_inventory_quantity;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getGrams ()
    {
        return grams;
    }

    public void setGrams (String grams)
    {
        this.grams = grams;
    }

    public String getInventory_management ()
    {
        return inventory_management;
    }

    public void setInventory_management (String inventory_management)
    {
        this.inventory_management = inventory_management;
    }

    public String getCompare_at_price ()
    {
        return compare_at_price;
    }

    public void setCompare_at_price (String compare_at_price)
    {
        this.compare_at_price = compare_at_price;
    }

    public String getInventory_quantity ()
    {
        return inventory_quantity;
    }

    public void setInventory_quantity (String inventory_quantity)
    {
        this.inventory_quantity = inventory_quantity;
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
		builder.append("Variant [position=").append(position).append(", weight=").append(weight).append(", product_id=")
				.append(product_id).append(", taxable=").append(taxable).append(", inventory_policy=")
				.append(inventory_policy).append(", barcode=").append(barcode).append(", weight_unit=")
				.append(weight_unit).append(", sku=").append(sku).append(", fulfillment_service=")
				.append(fulfillment_service).append(", image_id=").append(image_id)
				.append(", id=").append(id).append(", option1=").append(option1).append(", option2=").append(option2)
				.append(", option3=").append(option3).append(", title=").append(title).append(", updated_at=")
				.append(updated_at).append(", price=").append(price).append(", requires_shipping=")
				.append(requires_shipping).append(", old_inventory_quantity=").append(old_inventory_quantity)
				.append(", created_at=").append(created_at).append(", grams=").append(grams)
				.append(", inventory_management=").append(inventory_management).append(", compare_at_price=")
				.append(compare_at_price).append(", inventory_quantity=").append(inventory_quantity).append("]");
		return builder.toString();
	}
    
}