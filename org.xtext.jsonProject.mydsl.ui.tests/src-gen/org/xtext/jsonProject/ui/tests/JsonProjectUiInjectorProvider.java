/*
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.jsonProject.mydsl.ui.internal.MydslActivator;

public class JsonProjectUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("org.xtext.jsonProject.JsonProject");
	}

}