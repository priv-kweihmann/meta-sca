SRC_URI += "https://proxy.golang.org/github.com/imdario/mergo/@v/v0.3.13.zip;srcoutput=github.com/imdario/mergo;srcinput=github.com/imdario/mergo@v0.3.13;downloadfilename=github-com-imdario-mergo-0.3.13.zip;name=github-com-imdario-mergo"
SRC_URI[github-com-imdario-mergo.sha256sum] = "04f72d0e4695b4a004846a5d4f60d2dc381bacb032ebb8d58905e6eb00d121d2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
"

GOSRC_INCLUDEGUARD += "github.com-imdario-mergo-sources.inc"

