SRC_URI_append = " https://proxy.golang.org/github.com/go-sql-driver/mysql/@v/v1.5.0.zip;srcoutput=github.com/go-sql-driver/mysql;srcinput=github.com/go-sql-driver/mysql@v1.5.0;downloadfilename=github-com-go-sql-driver-mysql-1.5.0.zip;name=github-com-go-sql-driver-mysql"
SRC_URI[github-com-go-sql-driver-mysql.sha256sum] = "0096578da82b58a7103152d76b20d3a140adc30ca2e0769c5cd570b7d09e6566"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/go-sql-driver/mysql/LICENSE;md5=815ca599c9df247a0c7f619bab123dad \
"
