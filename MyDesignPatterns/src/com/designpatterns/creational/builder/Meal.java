package com.designpatterns.creational.builder;

public class Meal {

	private final String miniMeal;
	private final String comboMeal;
	private final String biryani;

	private Meal(Builder builder) {
		this.biryani = builder.biryani;
		this.comboMeal = builder.comboMeal;
		this.miniMeal = builder.miniMeal;
	}

	public static class Builder {

		private String miniMeal;
		private String comboMeal;
		private String biryani;

		public Builder miniMeal(String miniMeal) {
			this.miniMeal = miniMeal;
			return this;
		}

		public Builder biryani(String biryani) {
			this.biryani = biryani;
			return this;
		}

		public Builder comboMeal(String comboMeal) {
			this.comboMeal = comboMeal;
			return this;
		}

		public Meal build() {
			return new Meal(this);
		}
	}

	public String getMiniMeal() {
		return miniMeal;
	}

	public String getComboMeal() {
		return comboMeal;
	}

	public String getBiryani() {
		return biryani;
	}

	@Override
	public String toString() {
		return "Meal [miniMeal=" + miniMeal + ", comboMeal=" + comboMeal + ", biryani=" + biryani + "]";
	}

}
