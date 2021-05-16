SRC_URI += "https://proxy.golang.org/github.com/jmoiron/sqlx/@v/v1.3.4.zip;srcoutput=github.com/jmoiron/sqlx;srcinput=github.com/jmoiron/sqlx@v1.3.4;downloadfilename=github-com-jmoiron-sqlx-1.3.4.zip;name=github-com-jmoiron-sqlx"
SRC_URI[github-com-jmoiron-sqlx.sha256sum] = "571a4b2a905b4c83d792cefacb34ccf026eafaa1711dbf7a5171dda401dc163f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jmoiron/sqlx/LICENSE;md5=4353e10ea313ec47121dd2c7d89ce6b9 \
"

GOSRC_INCLUDEGUARD += "github.com-jmoiron-sqlx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
