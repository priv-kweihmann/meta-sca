SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/go-internal/@v/v1.13.1.zip;srcoutput=github.com/rogpeppe/go-internal;srcinput=github.com/rogpeppe/go-internal@v1.13.1;downloadfilename=github-com-rogpeppe-go-internal-1.13.1.zip;name=github-com-rogpeppe-go-internal"
SRC_URI[github-com-rogpeppe-go-internal.sha256sum] = "cc0746bf67c2d5d536d305db9f7c5cbe8ffa84928fd90262fb447685db0f1bc2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://github.com/rogpeppe/go-internal/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "github.com-rogpeppe-go-internal-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
