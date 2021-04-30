SRC_URI += "https://proxy.golang.org/golang.org/x/net/@v/v0.0.0-20210428185706-aea814203247.zip;srcoutput=golang.org/x/net;srcinput=golang.org/x/net@v0.0.0-20210428185706-aea814203247;downloadfilename=golang-org-x-net-0.0.0-20210428185706-aea814203247.zip;name=golang-org-x-net"
SRC_URI[golang-org-x-net.sha256sum] = "9f1a0fbc42cac1121d172581265969c0177685a7d51793704bfa77928194017b"
GOSRC_REMOVEDIRS += "golang.org/x/net/http2/h2demo"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-net-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
