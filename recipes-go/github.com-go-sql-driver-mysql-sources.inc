SRC_URI += "https://proxy.golang.org/github.com/go-sql-driver/mysql/@v/v1.6.0.zip;srcoutput=github.com/go-sql-driver/mysql;srcinput=github.com/go-sql-driver/mysql@v1.6.0;downloadfilename=github-com-go-sql-driver-mysql-1.6.0.zip;name=github-com-go-sql-driver-mysql"
SRC_URI[github-com-go-sql-driver-mysql.sha256sum] = "07f052b8f3fb4c1bb8caaf2fdb95c0f13e4261c72494a16900728af9f2eee706"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-sql-driver/mysql/LICENSE;md5=815ca599c9df247a0c7f619bab123dad \
"

GOSRC_INCLUDEGUARD += "github.com-go-sql-driver-mysql-sources.inc"

