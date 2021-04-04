SRC_URI += "https://proxy.golang.org/github.com/rogpeppe/go-internal/@v/v1.8.0.zip;srcoutput=github.com/rogpeppe/go-internal;srcinput=github.com/rogpeppe/go-internal@v1.8.0;downloadfilename=github-com-rogpeppe-go-internal-1.8.0.zip;name=github-com-rogpeppe-go-internal"
SRC_URI[github-com-rogpeppe-go-internal.sha256sum] = "23748dd2311c9a8601ee1c33161519c7a025e06987d164cef7377785c7bb00c9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rogpeppe/go-internal/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "github.com-rogpeppe-go-internal-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-diff-sources.inc', '', 'github.com-pkg-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-errgo.v2-sources.inc', '', 'gopkg.in-errgo.v2-sources.inc', d)}
