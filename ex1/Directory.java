package by.htp.part02.block10.ex1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private List <File> files;
	private List <Directory> subDirectory;
	
	public Directory() {
		name = new String("NewDirectory");
		subDirectory = new ArrayList<Directory>();
		files = new ArrayList<File>();
	}

	public Directory(String name, List<Directory> directory, List<File> files) {
		this.name = name;
		this.subDirectory = directory;
		this.files = files;
	}
	
	public List<File> getFiles() {
		return files;
	}
	
	public void setFiles(List<File> files) {
		this.files = files;
	}
	
	public List<Directory> getSubDirectory() {
		return subDirectory;
	}
	
	public void setSubDirectory(List<Directory> subDirectory) {
		this.subDirectory = subDirectory;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((subDirectory == null) ? 0 : subDirectory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null) {
				return false;
			}
		} else if (!files.equals(other.files)) {
			return false;
		}
		if (subDirectory == null) {
			if (other.subDirectory != null) {
				return false;
			}
		} else if (!subDirectory.equals(other.subDirectory)) { 
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Directory [name = " + name + "files=" + files + ", subDirectory=" + subDirectory +  "]";
	}

}
