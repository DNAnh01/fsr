package com.dnanh01.persistence.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.dnanh01.persistence.ItemDto;
import com.dnanh01.persistence.ItemGroupDto;

public class ItemGroupTransformer {
    private ItemGroupTransformer() {

    }

    public static ItemGroupDto transform(ResultSet rs) throws SQLException {

        return new ItemGroupDto()
                .builder()
                .ItemGroupId(rs.getInt("MaLH"))
                .ItemGroupName(rs.getString("TenLH"))
                .AmountOfItems(rs.getInt("SoLuong"))
                .Items(Pattern.compile(",") // 1-áo sơ mi Nam-152,2-áo sơ mi Nữ-180
                        .splitAsStream(rs.getString("DanhSachMatHang"))
                        .map(ItemDto::convert)
                        .collect(Collectors.toList()))
                .build();
    }
}
