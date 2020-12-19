package com.ninggcother;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportSelectorTest implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.ninggcother.ImportSelectorTest.ImportSelectorBean"};
	}

	static class ImportSelectorBean {

	}
}
