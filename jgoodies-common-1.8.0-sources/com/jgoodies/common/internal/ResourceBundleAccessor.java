/*
 * Copyright (c) 2009-2014 JGoodies Software GmbH. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of JGoodies Software GmbH nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jgoodies.common.internal;

import static com.jgoodies.common.base.Preconditions.checkNotNull;
import static com.jgoodies.common.internal.Messages.MUST_NOT_BE_NULL;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.Icon;

import com.jgoodies.common.base.Strings;

/**
 * Turns a ResourceBundle into a {@link StringAndIconResourceAccessor}.<p>
 *
 * <strong>Note:</strong> This class is not part of the public JGoodies Common API.
 * It's intended for implementation purposes only.
 * The class's API may change at any time.
 *
 * @author  Karsten Lentzsch
 *
 * @since 1.8
 */
public final class ResourceBundleAccessor implements StringAndIconResourceAccessor {

    
	private final ResourceBundle bundle;
	

	// Instance Creation ******************************************************
	
	public ResourceBundleAccessor(ResourceBundle bundle) {
		this.bundle = checkNotNull(bundle, MUST_NOT_BE_NULL, "resource bundle");
	}
	

    // IconResourceAccessor Implementation ************************************
	
	@Override
	public Icon getIcon(String key) {
	    return (Icon) bundle.getObject(key);
	}
	
    
	// StringResourceAccessor Implementation **********************************
	
    /**
     * {@inheritDoc}<p>
     * 
     * In case the resource key is missing in the bundle,
     * this implementation returns the key itself.
     *
     * @return the String value found for the given resource key,
     *    formatted with the optional arguments - if any,
     *    or - if the key is missing in the bundle -  the resource key itself
     */
    @Override
    public String getString(String key, Object... args) {
        try {
            return Strings.get(bundle.getString(key), args);
        } catch (MissingResourceException mre) {
            return key;
        }
    }

    
}
