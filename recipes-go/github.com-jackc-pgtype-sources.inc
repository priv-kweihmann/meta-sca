SRC_URI += "https://proxy.golang.org/github.com/jackc/pgtype/@v/v1.13.0.zip;srcoutput=github.com/jackc/pgtype;srcinput=github.com/jackc/pgtype@v1.13.0;downloadfilename=github-com-jackc-pgtype-1.13.0.zip;name=github-com-jackc-pgtype"
SRC_URI[github-com-jackc-pgtype.sha256sum] = "02afbc6c46b713f7e601440468d5bd02d6378dbb162fd695b13d73542bff49a8"

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
