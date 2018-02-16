package com.liferay.example.overridecorelanguagekey;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.language.UTF8Control;

/**
 * @author jrao
 */
@Component(
	immediate = true,
	property = {
		"language.id=es_ES"
	},
	service = ResourceBundle.class
)
public class ResourceBundleLoaderComponent extends ResourceBundle {

	@Override
	protected Object handleGetObject(String key) {
		Object object = _resourceBundle.getObject(key);
		
		return object;
	}

	@Override
	public Enumeration<String> getKeys() {
		Enumeration<String> keys = _resourceBundle.getKeys();
		
		return keys;
	}

	private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
			"content.Language", UTF8Control.INSTANCE);

}