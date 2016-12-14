package org.springframework.social.partnercenter.model.order;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {
	@JsonProperty
	private String id;
	@JsonProperty
	private String referenceCustomerId;
	@JsonProperty
	private List<LineItem> lineItems;
	@JsonProperty
	private String status;
	@JsonProperty
	private String creationDate;
	@JsonProperty
	private Map<String, String> attributes;

	public String getId() {
		return id;
	}

	public Order setId(String id) {
		this.id = id;
		return this;
	}

	public String getReferenceCustomerId() {
		return referenceCustomerId;
	}

	public Order setReferenceCustomerId(String referenceCustomerId) {
		this.referenceCustomerId = referenceCustomerId;
		return this;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public Order setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Order setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public Order setCreationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public Order setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}
}
