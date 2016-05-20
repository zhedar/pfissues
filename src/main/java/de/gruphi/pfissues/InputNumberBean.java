package de.gruphi.pfissues;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="inputNumber")
@ViewScoped
public class InputNumberBean implements Serializable {
	private static final long serialVersionUID = 4670739002424456225L;
	private Double number = Double.NaN;

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	public void request() {
		System.out.println("simulate request");
	}

}
