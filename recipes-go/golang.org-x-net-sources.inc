SRC_URI += "https://proxy.golang.org/golang.org/x/net/@v/v0.0.0-20211005001312-d4b1ae081e3b.zip;srcoutput=golang.org/x/net;srcinput=golang.org/x/net@v0.0.0-20211005001312-d4b1ae081e3b;downloadfilename=golang-org-x-net-0.0.0-20211005001312-d4b1ae081e3b.zip;name=golang-org-x-net"
SRC_URI[golang-org-x-net.sha256sum] = "8b1dfef9c60b6fea3d41dbb21eb14979ff867a19dfc34bc265e36d2f9a1c1dba"
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
