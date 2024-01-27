package com.drawingapp;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import rutvik.guice2.DrawShape;
import rutvik.guice2.DrawSquare;
import rutvik.guice2.SquareRequest;
import rutvik.guice2.SquareRequestSub;

public class AppModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
		bind(SquareRequest.class).to(SquareRequestSub.class);
		bind(String.class).annotatedWith(colorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
//		bind(SquareRequest.class).in(Scopes.SINGLETON);
	}
}
