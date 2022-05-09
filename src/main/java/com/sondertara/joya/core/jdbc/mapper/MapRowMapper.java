package com.sondertara.joya.core.jdbc.mapper;

import com.sondertara.joya.core.jdbc.Row;
import com.sondertara.joya.core.jdbc.mapper.RowMapper;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 将一行数据转换成Map
 *
 * @author huangxiaohu
 */
public class MapRowMapper implements RowMapper<Map<String, Object>> {
    @Override
    public Map<String, Object> map(Row row) {
        Map<String, Object> map = new LinkedHashMap<>();
        int count = row.getColumnCount();
        for (int i = 1; i <= count; i++) {
            String key = row.getColumnLabel(i);
            Object value = row.getObject(i);
            map.put(key, value);
        }
        return map;
    }
}
