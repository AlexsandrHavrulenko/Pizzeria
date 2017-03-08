package com.xzteam.pizzeria.api;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DishApi {
	@XmlElement(required=false)
    private Long id;
	@XmlElement(required=true)
    private String name;
	@XmlElement(required=true)
    private String description;
	@XmlElement(required=true)
    private String type;
	@XmlElement(required=true)
    private Float price;
	@XmlElement(required=true)
    private Integer weight;
	@XmlElement(required=true)
    private String imageUrl;
}
