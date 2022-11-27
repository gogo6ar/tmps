package com.company.factory.method;

import java.util.Optional;

public class IceCreamFactory {

	public static Optional<IceCream> getInstance(String type) {

		switch (type) {

		case "1":
			return Optional.of(new VanillaIceCream());
		case "2":
			return Optional.of(new StrawberryIceCream());
		case "3":
			return Optional.of(new ChocolateIceCream());

		}
//		throw new Exception()
		return Optional.empty();
	}
}
