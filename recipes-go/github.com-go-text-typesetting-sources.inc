SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting/@v/v0.0.0-20221111143014-22bec069817d.zip;srcoutput=github.com/go-text/typesetting;srcinput=github.com/go-text/typesetting@v0.0.0-20221111143014-22bec069817d;downloadfilename=github-com-go-text-typesetting-0.0.0-20221111143014-22bec069817d.zip;name=github-com-go-text-typesetting"
SRC_URI[github-com-go-text-typesetting.sha256sum] = "57ecec120ffd72b9e0e013bbc60b7327f74e26c1eee092c2664d4278498536e4"

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
