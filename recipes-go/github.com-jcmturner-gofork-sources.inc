SRC_URI += "https://proxy.golang.org/github.com/jcmturner/gofork/@v/v1.0.0.zip;srcoutput=github.com/jcmturner/gofork;srcinput=github.com/jcmturner/gofork@v1.0.0;downloadfilename=github-com-jcmturner-gofork-1.0.0.zip;name=github-com-jcmturner-gofork"
SRC_URI[github-com-jcmturner-gofork.sha256sum] = "5e015dd9b038f1dded0b2ded77e529d2f6ba0bed228a98831af5a3610eefcb52"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jcmturner/gofork/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-jcmturner-gofork-sources.inc"

