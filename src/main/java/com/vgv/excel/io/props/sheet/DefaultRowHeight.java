/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Vedran Grgo Vatavuk
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.vgv.excel.io.props.sheet;

import com.vgv.excel.io.Props;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Default row height.
 * @author Vedran Vatavuk (123vgv@gmail.com)
 * @version $Id$
 * @since 1.0
 */
@SuppressWarnings("PMD.AvoidUsingShortType")
public final class DefaultRowHeight implements Props<Sheet> {

    /**
     * Row height.
     */
    private final short value;

    /**
     * Ctor.
     * @param height Height.
     */
    public DefaultRowHeight(final short height) {
        this.value = height;
    }

    @Override
    public void accept(final Sheet sheet) {
        sheet.setDefaultRowHeight(this.value);
    }

    /**
     * Default row height in points.
     */
    public static final class InPoints implements Props<Sheet> {

        /**
         * Heith in points.
         */
        private final float value;

        /**
         * Ctor.
         * @param height Height in points
         */
        public InPoints(final float height) {
            this.value = height;
        }

        @Override
        public void accept(final Sheet sheet) {
            sheet.setDefaultRowHeightInPoints(this.value);
        }
    }
}
