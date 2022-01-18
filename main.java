public class Scanner {
	public void addListener(O obj) {
		notNull(obj);
		validate(obj);
		listeners.add(obj.getListener());
	}
}
