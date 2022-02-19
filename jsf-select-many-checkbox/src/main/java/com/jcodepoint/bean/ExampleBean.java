package com.jcodepoint.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SelectItem> rivers;
	private Map<String, String> lakes;
	
	private String[] checkedCountries;
	private String[] checkedRivers;	
	private String[] checkedLakes;	
	
	
	@PostConstruct
	public void init() {
		this.rivers = new ArrayList<SelectItem>();
		this.rivers.add(new SelectItem("parana", "Paraná"));
		this.rivers.add(new SelectItem("limay", "Limay"));
		this.rivers.add(new SelectItem("salado", "Salado"));
		this.rivers.add(new SelectItem("uruguay", "Uruguay"));
		
		this.lakes = new HashMap<String, String>();
		this.lakes.put("san-roque", "San Roque");
		this.lakes.put("argentino", "Argentino");
		this.lakes.put("nahuel-huapi", "Nahuel Huapi");
		
	}

	public String[] getCheckedCountries() {
		return this.checkedCountries;
	}

	public void setCheckedCountries(String[] checkedCountries) {
		this.checkedCountries = checkedCountries;
	}
	
	public List<SelectItem> getRivers() {
		return this.rivers;
	}

	public void setRivers(List<SelectItem> rivers) {
		this.rivers = rivers;
	}

	public Map<String, String> getLakes() {
		return lakes;
	}
	
	public void setLakes(Map<String, String> lakes) {
		this.lakes = lakes;
	}
	
	
	public String[] getCheckedRivers() {
		return checkedRivers;
	}

	public void setCheckedRivers(String[] checkedRivers) {
		this.checkedRivers = checkedRivers;
	}

	public String[] getCheckedLakes() {
		return checkedLakes;
	}

	public void setCheckedLakes(String[] checkedLakes) {
		this.checkedLakes = checkedLakes;
	}

	
	public String getCheckedCountriesString() {
		return Arrays.toString(this.checkedCountries);
	}

	public String getCheckedRiversString() {
		return Arrays.toString(this.getCheckedRivers());
	}
	
	public String getCheckedLakesString() {
		return Arrays.toString(this.getCheckedLakes());
	}
	
	
	public String aceptar() {
		System.out.println("");
		System.out.println("-> Checked Countries:");
		System.out.println("");
		
		if (this.checkedCountries != null) {
			if (this.checkedCountries.length > 0) {
				for (int i = 0; i < this.checkedCountries.length; i++) {
					System.out.println("-> checkedCountries[" + i + "]: " + this.checkedCountries[i]);
				}
			}
		}

		System.out.println("");
		System.out.println("-> Checked Rivers:");
		System.out.println("");
		
		if (this.checkedRivers != null) {
			if (this.checkedRivers.length > 0) {
				for (int i = 0; i < this.checkedRivers.length; i++) {
					System.out.println("-> checkedRivers[" + i + "]: " + this.checkedRivers[i]);
				}
			}
		}

		System.out.println("");
		System.out.println("-> Checked Lakes:");
		System.out.println("");
		
		if (this.checkedLakes != null) {
			if (this.checkedLakes.length > 0) {
				for (int i = 0; i < this.checkedLakes.length; i++) {
					System.out.println("-> checkedLakes[" + i + "]: " + this.checkedLakes[i]);
				}
			}
		}

		return "result";
	}
	
	public String volver() {
		return "inicio";
	}

}
