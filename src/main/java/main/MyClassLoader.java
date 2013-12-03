package main;

class MyClassLoader extends ClassLoader {
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		if (true)
			return super.loadClass(name);
		return findClass(name);
	}

	@Override
	public Class findClass(String name) {
		byte[] b = new byte[10];
		return defineClass(name, b, 0, b.length);
	}

}
