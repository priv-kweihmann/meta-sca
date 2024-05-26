SRC_URI += "https://proxy.golang.org/gopkg.in/check.v1/@v/v1.0.0-20201130134442-10cb98267c6c.zip;srcoutput=gopkg.in/check.v1;srcinput=gopkg.in/check.v1@v1.0.0-20201130134442-10cb98267c6c;downloadfilename=gopkg-in-check-v1-1.0.0-20201130134442-10cb98267c6c.zip;name=gopkg-in-check-v1"
SRC_URI[gopkg-in-check-v1.sha256sum] = "f555684e5c5dacc2850dddb345fef1b8f93f546b72685589789da6d2b062710e"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://gopkg.in/check.v1/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed \
"

GOSRC_INCLUDEGUARD += "gopkg.in-check.v1-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-pretty-sources.inc', '', 'github.com-kr-pretty-sources.inc', d)}
