/*
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JsonProjectAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/jsonProject/parser/antlr/internal/InternalJsonProject.tokens");
	}
}
