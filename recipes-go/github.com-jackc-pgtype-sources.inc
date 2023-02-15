SRC_URI += "https://proxy.golang.org/github.com/jackc/pgtype/@v/v1.14.0.zip;srcoutput=github.com/jackc/pgtype;srcinput=github.com/jackc/pgtype@v1.14.0;downloadfilename=github-com-jackc-pgtype-1.14.0.zip;name=github-com-jackc-pgtype"
SRC_URI[github-com-jackc-pgtype.sha256sum] = "7e67f5b944cbd401025c6473e624ef61ed196e3ed0f77ed437b0621cf820c0c9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgtype/LICENSE;md5=6d996fb721b0bbe83ef9c55fee3f0c97 \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgtype-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gofrs-uuid-sources.inc', '', 'github.com-gofrs-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgconn-sources.inc', '', 'github.com-jackc-pgconn-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgio-sources.inc', '', 'github.com-jackc-pgio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgx-v4-sources.inc', '', 'github.com-jackc-pgx-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shopspring-decimal-sources.inc', '', 'github.com-shopspring-decimal-sources.inc', d)}
