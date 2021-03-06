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
package com.vgv.excel.io.cells;

import java.util.Calendar;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * Cell that holds calendar value.
 * @author Vedran Vatavuk (123vgv@gmail.com)
 * @version $Id$
 * @since 0.3
 */
public final class CalendarCell extends AbstractStyleableCell {

    /**
     * Cell position.
     */
    private final int position;

    /**
     * Calendar value.
     */
    private final Calendar value;

    /**
     * Ctor.
     * @param calendar Calendar
     */
    public CalendarCell(final Calendar calendar) {
        this(-1, calendar);
    }

    /**
     * Ctor.
     * @param column Cell position
     * @param calendar Calendar
     */
    public CalendarCell(final int column, final Calendar calendar) {
        super();
        this.position = column;
        this.value = calendar;
    }

    @Override
    public Cell attachTo(final Row row) {
        final Cell cell = new EmptyCell(this.position).attachTo(row);
        cell.setCellValue(this.value);
        return cell;
    }
}
