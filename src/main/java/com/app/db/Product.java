package com.app.db;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product")
public class Product
{
    private String tags;

    private String handle;

    private String published_scope;

    private String vendor;

    private String body_html;
    
    private Image image;

    private String product_type;

    private String published_at;

    private String template_suffix;

    @Id
    private String _id;
    
    private Long id;

    private String title;

    private String updated_at;
    
    private List<Image> images;
    
    private List<Variant> variants;

    private String created_at;
    
    private List<Option> options;

    public String getTags ()
    {
        return tags;
    }

    public void setTags (String tags)
    {
        this.tags = tags;
    }

    public String getHandle ()
    {
        return handle;
    }

    public void setHandle (String handle)
    {
        this.handle = handle;
    }

    public String getPublished_scope ()
    {
        return published_scope;
    }

    public void setPublished_scope (String published_scope)
    {
        this.published_scope = published_scope;
    }

    public String getVendor ()
    {
        return vendor;
    }

    public void setVendor (String vendor)
    {
        this.vendor = vendor;
    }

    public String getBody_html ()
    {
        return body_html;
    }

    public void setBody_html (String body_html)
    {
        this.body_html = body_html;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getProduct_type ()
    {
        return product_type;
    }

    public void setProduct_type (String product_type)
    {
        this.product_type = product_type;
    }

    public String getPublished_at ()
    {
        return published_at;
    }

    public void setPublished_at (String published_at)
    {
        this.published_at = published_at;
    }

    public String getTemplate_suffix ()
    {
        return template_suffix;
    }

    public void setTemplate_suffix (String template_suffix)
    {
        this.template_suffix = template_suffix;
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

    public List<Image> getImages ()
    {
        return images;
    }

    public void setImages (List<Image> images)
    {
        this.images = images;
    }

    public List<Variant> getVariants ()
    {
        return variants;
    }

    public void setVariants (List<Variant> variants)
    {
        this.variants = variants;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public List<Option> getOptions ()
    {
        return options;
    }

    public void setOptions (List<Option> options)
    {
        this.options = options;
    }

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [tags=").append(tags).append(", handle=").append(handle).append(", published_scope=")
				.append(published_scope).append(", vendor=").append(vendor).append(", body_html=").append(body_html)
				.append(", image=").append(image).append(", product_type=").append(product_type)
				.append(", published_at=").append(published_at).append(", template_suffix=").append(template_suffix)
				.append(", _id=").append(_id).append(", id=").append(id).append(", title=").append(title)
				.append(", updated_at=").append(updated_at).append(", images=").append(images).append(", variants=")
				.append(variants).append(", created_at=").append(created_at).append(", options=").append(options)
				.append("]");
		return builder.toString();
	}
    
}