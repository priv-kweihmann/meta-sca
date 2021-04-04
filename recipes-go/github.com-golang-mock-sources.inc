SRC_URI += "https://proxy.golang.org/github.com/golang/mock/@v/v1.5.0.zip;srcoutput=github.com/golang/mock;srcinput=github.com/golang/mock@v1.5.0;downloadfilename=github-com-golang-mock-1.5.0.zip;name=github-com-golang-mock"
SRC_URI[github-com-golang-mock.sha256sum] = "87e7217adce199e9a3c2813174e221a4e06cde85b1423c7462b4fa422cbfbede"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/mock/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-mock-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
