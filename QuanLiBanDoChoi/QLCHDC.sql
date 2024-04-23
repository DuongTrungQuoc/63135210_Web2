CREATE DATABASE QLCHDC

-- Tạo bảng Chất liệu
CREATE TABLE ChatLieu (
    MaChatLieu VARCHAR(10) PRIMARY KEY,
    TenChatLieu VARCHAR(50) NOT NULL
);

-- Tạo bảng Hàng Hóa
CREATE TABLE HangHoa (
    MaHang VARCHAR(10) PRIMARY KEY,
    TenHang VARCHAR(100) NOT NULL,
    MaChatLieu VARCHAR(10) NOT NULL,
    SoLuong INT NOT NULL,
    DonGiaNhap DECIMAL(10, 2) NOT NULL,
    DonGiaBan DECIMAL(10, 2) NOT NULL,
    Anh VARCHAR(255),
    GhiChu TEXT,
    FOREIGN KEY (MaChatLieu) REFERENCES ChatLieu(MaChatLieu)
);

-- Tạo bảng Nhân viên
CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(10) PRIMARY KEY,
    TenNhanVien VARCHAR(100) NOT NULL,
    GioiTinh CHAR(1) CHECK (GioiTinh IN ('M', 'F')),
    DiaChi TEXT,
    SoDienThoai VARCHAR(15),
    NgaySinh DATE
);

-- Tạo bảng Khách
CREATE TABLE Khach (
    MaKhach VARCHAR(10) PRIMARY KEY,
    TenKhach VARCHAR(100) NOT NULL,
    DiaChi TEXT,
    SoDienThoai VARCHAR(15)
);

-- Tạo bảng Hóa đơn bán
CREATE TABLE HoaDonBan (
    MaHoaDonBan VARCHAR(10) PRIMARY KEY,
    MaNhanVien VARCHAR(10) NOT NULL,
    NgayBan DATE NOT NULL,
    MaKhach VARCHAR(10),
    TongTien DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaKhach) REFERENCES Khach(MaKhach)
);

-- Tạo bảng Chi tiết hóa đơn bán
CREATE TABLE ChiTietHoaDonBan (
    MaHoaDonBan VARCHAR(10),
    MaHang VARCHAR(10),
    SoLuong INT NOT NULL,
    DonGia DECIMAL(10, 2) NOT NULL,
    GiamGia DECIMAL(10, 2) DEFAULT 0.00,
    ThanhTien DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (MaHoaDonBan, MaHang),
    FOREIGN KEY (MaHoaDonBan) REFERENCES HoaDonBan(MaHoaDonBan),
    FOREIGN KEY (MaHang) REFERENCES HangHoa(MaHang)
);
