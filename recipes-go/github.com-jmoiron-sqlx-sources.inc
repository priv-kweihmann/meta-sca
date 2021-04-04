SRC_URI += "https://proxy.golang.org/github.com/jmoiron/sqlx/@v/v1.3.1.zip;srcoutput=github.com/jmoiron/sqlx;srcinput=github.com/jmoiron/sqlx@v1.3.1;downloadfilename=github-com-jmoiron-sqlx-1.3.1.zip;name=github-com-jmoiron-sqlx"
SRC_URI[github-com-jmoiron-sqlx.sha256sum] = "84cf22439d71b3dfe534639a128f4459664976271941c2a33bef5c5aa4f7ed70"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jmoiron/sqlx/LICENSE;md5=4353e10ea313ec47121dd2c7d89ce6b9 \
"

GOSRC_INCLUDEGUARD += "github.com-jmoiron-sqlx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
