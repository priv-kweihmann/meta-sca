SRC_URI += "https://proxy.golang.org/github.com/casbin/casbin/v2/@v/v2.41.1.zip;srcoutput=github.com/casbin/casbin/v2;srcinput=github.com/casbin/casbin/v2@v2.41.1;downloadfilename=github-com-casbin-casbin-v2-2.41.1.zip;name=github-com-casbin-casbin-v2"
SRC_URI[github-com-casbin-casbin-v2.sha256sum] = "d1b45a69d4531d55cb9a8e4e87057bf688367a362488551a8db056f765e6e050"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/casbin/casbin/v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-casbin-casbin-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-knetic-govaluate-sources.inc', '', 'github.com-knetic-govaluate-sources.inc', d)}
