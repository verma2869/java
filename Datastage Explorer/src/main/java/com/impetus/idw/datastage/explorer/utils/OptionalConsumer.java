package com.impetus.idw.datastage.explorer.utils;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * The Class OptionalConsumer.
 *
 * @param <T>
 *            the generic type
 */
public class OptionalConsumer<T> {

	/** The optional. */
	private Optional<T> optional;

	/**
	 * Instantiates a new optional consumer.
	 *
	 * @param optional
	 *            the optional
	 */
	private OptionalConsumer(Optional<T> optional) {
		this.optional = optional;
	}

	/**
	 * Of.
	 *
	 * @param <T>
	 *            the generic type
	 * @param optional
	 *            the optional
	 * @return the optional consumer
	 */
	public static <T> OptionalConsumer<T> of(Optional<T> optional) {
		return new OptionalConsumer<>(optional);
	}

	/**
	 * If present.
	 *
	 * @param c
	 *            the c
	 * @return the optional consumer
	 */
	public OptionalConsumer<T> ifPresent(Consumer<T> c) {
		optional.ifPresent(c);
		return this;
	}

	/**
	 * If not present.
	 *
	 * @param r
	 *            the r
	 * @return the optional consumer
	 */
	public OptionalConsumer<T> ifNotPresent(Runnable r) {
		if (!optional.isPresent()) {
			r.run();
		}
		return this;
	}

	/**
	 * Checks if is present.
	 *
	 * @return true, if is present
	 */
	public boolean isPresent() {
		return optional.isPresent();
	}

	/**
	 * Gets the.
	 *
	 * @return the t
	 */
	public T get() {
		return optional.isPresent() ? optional.get() : null;
	}

	/**
	 * Sets the.
	 *
	 * @param optional
	 *            the optional
	 */
	public void set(Optional<T> optional) {
		this.optional = optional;
	}
}