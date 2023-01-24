/*
 * The MIT License
 *
 * Copyright 2014 Jesse Glick.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import edu.umd.cs.findbugs.annotations.NonNull;
import org.jenkinsci.plugins.scriptsecurity.sandbox.Whitelist;

/**
 * Whitelists everything.
 * This is probably only useful for tests.
 */
public final class BlanketWhitelist extends Whitelist {

    @Override public boolean permitsMethod(@NonNull Method method, @NonNull Object receiver, @NonNull Object[] args) {
        return true;
    }

    @Override public boolean permitsConstructor(@NonNull Constructor<?> constructor, @NonNull Object[] args) {
        return true;
    }

    @Override public boolean permitsStaticMethod(@NonNull Method method, @NonNull Object[] args) {
        return true;
    }

    @Override public boolean permitsFieldSet(@NonNull Field field, @NonNull Object receiver, Object value) {
        return true;
    }

    @Override public boolean permitsFieldGet(@NonNull Field field, @NonNull Object receiver) {
        return true;
    }

    @Override public boolean permitsStaticFieldSet(@NonNull Field field, Object value) {
        return true;
    }

    @Override public boolean permitsStaticFieldGet(@NonNull Field field) {
        return true;
    }

}
