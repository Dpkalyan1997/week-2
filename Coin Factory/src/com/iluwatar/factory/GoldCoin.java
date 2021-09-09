package com.iluwatar.factory;

public class GoldCoin implements Coin {

	  static final String DESCRIPTION = "This is a gold coin.";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

	@Override
	public Coin get() {
		// TODO Auto-generated method stub
		return null;
	}
	}