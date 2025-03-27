package com.petstore;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Order.
 */
public class Order{

    @JsonProperty("petId")
    private Integer petId;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("shipDate")
    private String shipDate;

    @JsonProperty("complete")
    private Boolean complete;

    @JsonProperty("status")
    private String status;

    /**
     * Set pet id.
     *
     * @param petId the pet id
     */
    public void setPetId(Integer petId){
        this.petId = petId;
    }

    /**
     * Get pet id integer.
     *
     * @return the integer
     */
    public Integer getPetId(){
        return petId;
    }

    /**
     * Set quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    /**
     * Get quantity integer.
     *
     * @return the integer
     */
    public Integer getQuantity(){
        return quantity;
    }

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id integer.
     *
     * @return the integer
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set ship date.
     *
     * @param shipDate the ship date
     */
    public void setShipDate(String shipDate){
        this.shipDate = shipDate;
    }

    /**
     * Get ship date string.
     *
     * @return the string
     */
    public String getShipDate(){
        return shipDate;
    }

    /**
     * Set complete.
     *
     * @param complete the complete
     */
    public void setComplete(Boolean complete){
        this.complete = complete;
    }

    /**
     * Is complete boolean.
     *
     * @return the boolean
     */
    public Boolean isComplete(){
        return complete;
    }

    /**
     * Set status.
     *
     * @param status the status
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     * Get status string.
     *
     * @return the string
     */
    public String getStatus(){
        return status;
    }

    @Override
     public String toString(){
        return 
            "Order{" + 
            "petId = '" + petId + '\'' + 
            ",quantity = '" + quantity + '\'' + 
            ",id = '" + id + '\'' + 
            ",shipDate = '" + shipDate + '\'' + 
            ",complete = '" + complete + '\'' + 
            ",status = '" + status + '\'' + 
            "}";
        }
}