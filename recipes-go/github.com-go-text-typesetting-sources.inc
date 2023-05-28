SRC_URI += "https://proxy.golang.org/github.com/go-text/typesetting/@v/v0.0.0-20230520134535-86265021ae8e.zip;srcoutput=github.com/go-text/typesetting;srcinput=github.com/go-text/typesetting@v0.0.0-20230520134535-86265021ae8e;downloadfilename=github-com-go-text-typesetting-0.0.0-20230520134535-86265021ae8e.zip;name=github-com-go-text-typesetting"
SRC_URI[github-com-go-text-typesetting.sha256sum] = "538d573edd36dab4ac50334e7bfeacc0e49617c0e29dae120d3279d081a13e82"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-text/typesetting/LICENSE;md5=72e4ee4d6a5273e2974e8c4c8a272733 \
    file://src/github.com/go-text/typesetting/harfbuzz/LICENSE;md5=0c02738f95d7ce8b830e39543ca76c41 \
"

GOSRC_INCLUDEGUARD += "github.com-go-text-typesetting-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-text-typesetting-utils-sources.inc', '', 'github.com-go-text-typesetting-utils-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
