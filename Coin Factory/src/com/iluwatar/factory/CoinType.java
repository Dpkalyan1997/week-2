package com.iluwatar.factory;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CoinType {
	
  COPPER(CopperCoin::new),
  GOLD(GoldCoin::new);


void GoldCoin(Object object) {
	// TODO Auto-generated constructor stub
}

void CopperCoin(Object object) {
	// TODO Auto-generated constructor stub
}

private final Supplier<Coin> constructor;

Coin getConstructor() {
	// TODO Auto-generated method stub
	return null;
}

}