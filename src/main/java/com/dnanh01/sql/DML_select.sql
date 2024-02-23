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

-- get item-group by id

SELECT * FROM loaihang WHERE MaLH = 1;

-- MaNV, TenNV, Email, SDT, DiaChi, MaCV, MatKhau
INSERT INTO nhanvien(MaNV, TenNV, Email, SDT, DiaChi, MaCV, MatKhau)
VALUES(8, "Đỗ Nguyên Ánh", "donguyenanh2k1@gmail.com", "0123456789", "Liên Chiểu - Đà Nẵng");

-- NhanVien: login

SELECT 
nv.MaNV,
nv.TenNV,
nv.Email,
nv.SDT, 
nv.DiaChi, 
nv.MaCV
FROM nhanvien nv 
WHERE nv.Email = "com1.default.tp@gmail.com"
AND nv.MatKhau = "827ccb0eea8a706c4c34a16891f84e7b";