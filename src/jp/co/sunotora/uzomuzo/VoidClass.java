package jp.co.sunotora.uzomuzo;

public class VoidClass {
	/*
	 * Return the Virtual Machine's Class object for the named
	 * primitive type.
	 */
	private static native Class<?> getPrimitiveClass(String name);

	/**
	 * The {@code Class} object representing the pseudo-type corresponding to
	 * the keyword {@code void}.
	 */
	@SuppressWarnings("unchecked")
	public static final Class<Void> TYPE = (Class<Void>) getPrimitiveClass("void");

	/*
	 * The Void class cannot be instantiated.
	 */
	public VoidClass() {}
}
