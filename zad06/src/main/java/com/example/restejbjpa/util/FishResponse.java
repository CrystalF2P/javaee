package com.example.restejbjpa.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.example.restejbjpa.domain.Fish;

@XmlRootElement
public class FishResponse {
	
	private List<Fish> fish = new ArrayList<>();

	public List<Fish> getFish() {
		return fish;
	}

	public void setBook(List<Fish> fish) {
		this.fish = fish;
	}
}
