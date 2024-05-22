package com.pluralsight.visitor;

public interface AtvPart {
	void accept(AtvPartVisitor visitor);
}
