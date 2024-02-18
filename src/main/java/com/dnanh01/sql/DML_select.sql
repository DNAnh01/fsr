-- item: getAll
SELECT lh.MaLH, lh.TenLH, mh.MaMH, mh.TenMH, mh.MauSac
FROM loaihang lh
JOIN mathang mh
ON lh.MaLH = mh.MaLH;

