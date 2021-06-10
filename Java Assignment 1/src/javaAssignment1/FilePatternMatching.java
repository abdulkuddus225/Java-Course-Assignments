package javaAssignment1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FilePatternMatching {

	private String pattern;
	private String dir;

	public FilePatternMatching(String pattern, String dir) {
		// TODO Auto-generated constructor stub
		this.pattern = pattern;
		this.dir = dir;
	}

	public ArrayList<String> getFileNames() {

		File directory = new File(dir);
		File[] files = directory.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				String name = pathname.getName().toLowerCase();
				return name.contains(".") && pathname.isFile();
			}

		});
		ArrayList<String> fileNames = new ArrayList<String>();
		for (File file : files) {
			if (file.isFile()) {
				String addFile = file.getName().toString();
				fileNames.add(addFile);
			}

		}
		return fileNames;
	}

	public void getFilesWithPattern() {
		System.out.println("Files that matched the Regular Expression " + pattern);
		ArrayList<String> files = getFileNames();

		for (int i = 0; i < files.size(); i++) {
			boolean matched = Pattern.compile(pattern).matcher(files.get(i)).matches();
			if (matched) {
				System.out.println(files.get(i));
			}
		}

	}

}
