SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/go-internal/@v/v1.14.1.zip;srcoutput=github.com/rogpeppe/go-internal;srcinput=github.com/rogpeppe/go-internal@v1.14.1;downloadfilename=github-com-rogpeppe-go-internal-1.14.1.zip;name=github-com-rogpeppe-go-internal"
SRC_URI[github-com-rogpeppe-go-internal.sha256sum] = "ab3d18283cef2f46ddfd489b6b14b970eb7dbbb642786f025ee1ac5291dc4e70"

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
