SRC_URI += "https://proxy.golang.org/github.com/jackc/pgx/v4/@v/v4.17.1.zip;srcoutput=github.com/jackc/pgx/v4;srcinput=github.com/jackc/pgx/v4@v4.17.1;downloadfilename=github-com-jackc-pgx-v4-4.17.1.zip;name=github-com-jackc-pgx-v4"
SRC_URI[github-com-jackc-pgx-v4.sha256sum] = "e942f4c9fc9f365efea1d5071a312b0ce0cc65d6cf97cfd1175b24ed87440dc2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgx/v4/LICENSE;md5=6d996fb721b0bbe83ef9c55fee3f0c97 \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgx-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-kit-log-sources.inc', '', 'github.com-go-kit-log-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgconn-sources.inc', '', 'github.com-jackc-pgconn-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgio-sources.inc', '', 'github.com-jackc-pgio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgproto3-v2-sources.inc', '', 'github.com-jackc-pgproto3-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgtype-sources.inc', '', 'github.com-jackc-pgtype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-puddle-sources.inc', '', 'github.com-jackc-puddle-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rs-zerolog-sources.inc', '', 'github.com-rs-zerolog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-inconshreveable-log15.v2-sources.inc', '', 'gopkg.in-inconshreveable-log15.v2-sources.inc', d)}
