SRC_URI += "https://proxy.golang.org/github.com/casbin/casbin/v2/@v/v2.31.7.zip;srcoutput=github.com/casbin/casbin/v2;srcinput=github.com/casbin/casbin/v2@v2.31.7;downloadfilename=github-com-casbin-casbin-v2-2.31.7.zip;name=github-com-casbin-casbin-v2"
SRC_URI[github-com-casbin-casbin-v2.sha256sum] = "20bab0a0753fa79fa5be495fc86bf2370bc27a6bd9dd18ed511a0470f3035200"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/casbin/casbin/v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-casbin-casbin-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-knetic-govaluate-sources.inc', '', 'github.com-knetic-govaluate-sources.inc', d)}
