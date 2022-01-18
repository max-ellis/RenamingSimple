public class Reader {
	public void addListener(O obj) {
		validateObject(obj);
		listeners.add(obj.getListener());
	}

	public void validateObject(O obj) {
		notNull(obj);
		validate(obj);
	}
}
