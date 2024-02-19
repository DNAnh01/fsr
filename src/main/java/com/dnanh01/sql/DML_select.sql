-- item: getAll
SELECT lh.MaLH, lh.TenLH, mh.MaMH, mh.TenMH, mh.MauSac
FROM loaihang lh
JOIN mathang mh
ON lh.MaLH = mh.MaLH;

-- item: getItemByItemGroupName
SELECT *
FROM mathang mh
JOIN loaihang lh
ON mh.MaLH = lh.MaLH
WHERE lh.TenLH LIKE %"Thắt"%;

-- itemGroup: getAll
SELECT * FROM loaihang;

-- itemGroup: getItemGroups
WITH ThongTinMatHang AS
(SELECT mh.MaMH, 
        mh.TenMH, 
        SUM(ctmh.SoLuong) SoLuong, 
        lh.MaLH, 
        lh.TenLH
FROM loaihang lh
JOIN mathang mh
ON lh.MaLH = mh.MaLH
JOIN chitietmathang ctmh
ON mh.MaMH = ctmh.MaMH
GROUP BY mh.MaMH)
SELECT ttmh.MaLH,
ttmh.TenLH,
SUM(ttmh.SoLuong) SoLuong,
GROUP_CONCAT(CONCAT(ttmh.MaMH, "-", ttmh.TenMH, "-", ttmh.SoLuong)) DanhSachMatHang
FROM ThongTinMatHang ttmh
GROUP BY ttmh.MaLH;

