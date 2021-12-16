SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/go-internal/@v/v1.8.1.zip;srcoutput=github.com/rogpeppe/go-internal;srcinput=github.com/rogpeppe/go-internal@v1.8.1;downloadfilename=github-com-rogpeppe-go-internal-1.8.1.zip;name=github-com-rogpeppe-go-internal"
SRC_URI[github-com-rogpeppe-go-internal.sha256sum] = "d3d86854181b9fa008f294a1798d550337be44c8285dba9f2854f308d23931d2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rogpeppe/go-internal/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "github.com-rogpeppe-go-internal-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-diff-sources.inc', '', 'github.com-pkg-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-errgo.v2-sources.inc', '', 'gopkg.in-errgo.v2-sources.inc', d)}
