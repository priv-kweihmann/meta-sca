SRC_URI += "https://proxy.golang.org/github.com/jackc/pgproto3/v2/@v/v2.3.2.zip;srcoutput=github.com/jackc/pgproto3/v2;srcinput=github.com/jackc/pgproto3/v2@v2.3.2;downloadfilename=github-com-jackc-pgproto3-v2-2.3.2.zip;name=github-com-jackc-pgproto3-v2"
SRC_URI[github-com-jackc-pgproto3-v2.sha256sum] = "e6bafa5c3522534557a818f56939dde7b496c6669a5db9a74a0c91ab5290612c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgproto3/v2/LICENSE;md5=ea2961e52eec5b1203f8147a49ef985f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgproto3-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-chunkreader-v2-sources.inc', '', 'github.com-jackc-chunkreader-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackc-pgio-sources.inc', '', 'github.com-jackc-pgio-sources.inc', d)}
