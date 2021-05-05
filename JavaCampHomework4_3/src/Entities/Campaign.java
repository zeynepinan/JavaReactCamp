package Entities;

public class Campaign {

	private int id;
	private String campaingName;
	private double unitPrice;
	private double campaignRate;
	
	

	public Campaign(int id, String campaingName, double unitPrice, double campaignRate) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.unitPrice = unitPrice;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(double campaignRate) {
		this.campaignRate = campaignRate;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.campaignRate / 100);
	}
}
