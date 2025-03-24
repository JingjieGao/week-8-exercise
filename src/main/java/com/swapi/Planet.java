package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

/**
 * The type Planet.
 */
public class Planet{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("climate")
	private String climate;

	@JsonProperty("rotation_period")
	private String rotationPeriod;

	@JsonProperty("url")
	private String url;

	@JsonProperty("population")
	private String population;

	@JsonProperty("orbital_period")
	private String orbitalPeriod;

	@JsonProperty("surface_water")
	private String surfaceWater;

	@JsonProperty("diameter")
	private String diameter;

	@JsonProperty("gravity")
	private String gravity;

	@JsonProperty("name")
	private String name;

	@JsonProperty("residents")
	private List<String> residents;

	@JsonProperty("terrain")
	private String terrain;

	/**
	 * Set films.
	 *
	 * @param films the films
	 */
	public void setFilms(List<String> films){
		this.films = films;
	}

	/**
	 * Get films list.
	 *
	 * @return the list
	 */
	public List<String> getFilms(){
		return films;
	}

	/**
	 * Set edited.
	 *
	 * @param edited the edited
	 */
	public void setEdited(String edited){
		this.edited = edited;
	}

	/**
	 * Get edited string.
	 *
	 * @return the string
	 */
	public String getEdited(){
		return edited;
	}

	/**
	 * Set created.
	 *
	 * @param created the created
	 */
	public void setCreated(String created){
		this.created = created;
	}

	/**
	 * Get created string.
	 *
	 * @return the string
	 */
	public String getCreated(){
		return created;
	}

	/**
	 * Set climate.
	 *
	 * @param climate the climate
	 */
	public void setClimate(String climate){
		this.climate = climate;
	}

	/**
	 * Get climate string.
	 *
	 * @return the string
	 */
	public String getClimate(){
		return climate;
	}

	/**
	 * Set rotation period.
	 *
	 * @param rotationPeriod the rotation period
	 */
	public void setRotationPeriod(String rotationPeriod){
		this.rotationPeriod = rotationPeriod;
	}

	/**
	 * Get rotation period string.
	 *
	 * @return the string
	 */
	public String getRotationPeriod(){
		return rotationPeriod;
	}

	/**
	 * Set url.
	 *
	 * @param url the url
	 */
	public void setUrl(String url){
		this.url = url;
	}

	/**
	 * Get url string.
	 *
	 * @return the string
	 */
	public String getUrl(){
		return url;
	}

	/**
	 * Set population.
	 *
	 * @param population the population
	 */
	public void setPopulation(String population){
		this.population = population;
	}

	/**
	 * Get population string.
	 *
	 * @return the string
	 */
	public String getPopulation(){
		return population;
	}

	/**
	 * Set orbital period.
	 *
	 * @param orbitalPeriod the orbital period
	 */
	public void setOrbitalPeriod(String orbitalPeriod){
		this.orbitalPeriod = orbitalPeriod;
	}

	/**
	 * Get orbital period string.
	 *
	 * @return the string
	 */
	public String getOrbitalPeriod(){
		return orbitalPeriod;
	}

	/**
	 * Set surface water.
	 *
	 * @param surfaceWater the surface water
	 */
	public void setSurfaceWater(String surfaceWater){
		this.surfaceWater = surfaceWater;
	}

	/**
	 * Get surface water string.
	 *
	 * @return the string
	 */
	public String getSurfaceWater(){
		return surfaceWater;
	}

	/**
	 * Set diameter.
	 *
	 * @param diameter the diameter
	 */
	public void setDiameter(String diameter){
		this.diameter = diameter;
	}

	/**
	 * Get diameter string.
	 *
	 * @return the string
	 */
	public String getDiameter(){
		return diameter;
	}

	/**
	 * Set gravity.
	 *
	 * @param gravity the gravity
	 */
	public void setGravity(String gravity){
		this.gravity = gravity;
	}

	/**
	 * Get gravity string.
	 *
	 * @return the string
	 */
	public String getGravity(){
		return gravity;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set residents.
	 *
	 * @param residents the residents
	 */
	public void setResidents(List<String> residents){
		this.residents = residents;
	}

	/**
	 * Get residents list.
	 *
	 * @return the list
	 */
	public List<String> getResidents(){
		return residents;
	}

	/**
	 * Set terrain.
	 *
	 * @param terrain the terrain
	 */
	public void setTerrain(String terrain){
		this.terrain = terrain;
	}

	/**
	 * Get terrain string.
	 *
	 * @return the string
	 */
	public String getTerrain(){
		return terrain;
	}

	@Override
 	public String toString(){
		return 
			"Planet{" + 
			"films = '" + films + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",climate = '" + climate + '\'' + 
			",rotation_period = '" + rotationPeriod + '\'' + 
			",url = '" + url + '\'' + 
			",population = '" + population + '\'' + 
			",orbital_period = '" + orbitalPeriod + '\'' + 
			",surface_water = '" + surfaceWater + '\'' + 
			",diameter = '" + diameter + '\'' + 
			",gravity = '" + gravity + '\'' + 
			",name = '" + name + '\'' + 
			",residents = '" + residents + '\'' + 
			",terrain = '" + terrain + '\'' + 
			"}";
		}
}