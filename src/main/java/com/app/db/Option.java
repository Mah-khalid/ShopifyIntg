package com.app.db;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Option
{
    private String position;
    
    private Long id;

    private List<String> values;

    private String product_id;

    private String name;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public List<String> getValues ()
    {
        return values;
    }

    public void setValues (List<String> values)
    {
        this.values = values;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
		builder.append("Option [position=").append(position).append(", id=").append(id)
				.append(", values=").append(values).append(", product_id=").append(product_id).append(", name=")
				.append(name).append("]");
		return builder.toString();
	}
    
}