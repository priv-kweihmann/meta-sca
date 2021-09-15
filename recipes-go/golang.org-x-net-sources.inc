SRC_URI += "https://proxy.golang.org/golang.org/x/net/@v/v0.0.0-20210913180222-943fd674d43e.zip;srcoutput=golang.org/x/net;srcinput=golang.org/x/net@v0.0.0-20210913180222-943fd674d43e;downloadfilename=golang-org-x-net-0.0.0-20210913180222-943fd674d43e.zip;name=golang-org-x-net"
SRC_URI[golang-org-x-net.sha256sum] = "e03e4886f5d58569e3c3879df0cf72193a5d1c63acf08d6bda4c11761ee39437"
GOSRC_REMOVEDIRS += "golang.org/x/net/http2/h2demo"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-net-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
