SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting/@v/v0.0.0-20221012165447-0e1e8228dbc3.zip;srcoutput=github.com/go-text/typesetting;srcinput=github.com/go-text/typesetting@v0.0.0-20221012165447-0e1e8228dbc3;downloadfilename=github-com-go-text-typesetting-0.0.0-20221012165447-0e1e8228dbc3.zip;name=github-com-go-text-typesetting"
SRC_URI[github-com-go-text-typesetting.sha256sum] = "cd80ba426be093a515d81af4553c4580c2163270c24cc9e6312be99c8af024e6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-text/typesetting/LICENSE;md5=72e4ee4d6a5273e2974e8c4c8a272733 \
"

GOSRC_INCLUDEGUARD += "github.com-go-text-typesetting-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-benoitkugler-textlayout-sources.inc', '', 'github.com-benoitkugler-textlayout-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
