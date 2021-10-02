SRC_URI += "https://proxy.golang.org/github.com/casbin/casbin/v2/@v/v2.37.4.zip;srcoutput=github.com/casbin/casbin/v2;srcinput=github.com/casbin/casbin/v2@v2.37.4;downloadfilename=github-com-casbin-casbin-v2-2.37.4.zip;name=github-com-casbin-casbin-v2"
SRC_URI[github-com-casbin-casbin-v2.sha256sum] = "cef7e2e511dd3d8f6c1289474b33a956dbaaba91433c74e8020bf145c2bfd7d3"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/casbin/casbin/v2/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-casbin-casbin-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-knetic-govaluate-sources.inc', '', 'github.com-knetic-govaluate-sources.inc', d)}
