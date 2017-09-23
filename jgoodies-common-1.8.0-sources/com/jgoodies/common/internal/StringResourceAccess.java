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

import java.util.MissingResourceException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides access to String resources<p>
 *
 * <strong>Note:</strong> This class is not part
 * of the public JGoodies Common API.
 * It is intended for implementation purposes only.
 * The class's API may change at any time.
 *
 * @author  Karsten Lentzsch
 *
 * @since 1.8
 */
public final class StringResourceAccess {


    /**
     * Looks up and returns a String associated with the given resource key
     * from the given StringResourceAccessor.
     * If no arguments are provided, the plain String is returned.
     * Otherwise the string will be formatted using {@code String.format}
     * with the given arguments.<p>
     * 
     * If the resource is missing, the key itself is returned.
     *
     * @param accessor   maps keys to resource Strings
     * @param key   the key in the resource bundle
     * @param args  optional format arguments forwarded to {@code String#format}
     * @return the String value provided by the accessor for the given resource key
     *    formatted with the optional arguments - if any
     *
     * @see String#format(String, Object...)
     */
    public static String getResourceString(
            StringResourceAccessor accessor,
            String key, Object... args) {
        checkNotNull(accessor,
                "To use the internationalization support you must provide " +
                "a ResourceBundle, ResourceMap, or a StringResourceAccessor. " +
                "See #resources.");
        try {
            return accessor.getString(key, args);
        } catch (MissingResourceException ex) {
            Logger.getLogger(StringResourceAccess.class.getName()).log(
                    Level.WARNING, "Missing internationalized text", ex);
            return key;
        }
    }


}
