SRC_URI += "https://proxy.golang.org/github.com/imdario/mergo/@v/v0.3.12.zip;srcoutput=github.com/imdario/mergo;srcinput=github.com/imdario/mergo@v0.3.12;downloadfilename=github-com-imdario-mergo-0.3.12.zip;name=github-com-imdario-mergo"
SRC_URI[github-com-imdario-mergo.sha256sum] = "a89fac0be93400703776d7dc164433c2f1ecd7f1fe9dc0308584daf609545c7e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
"

GOSRC_INCLUDEGUARD += "github.com-imdario-mergo-sources.inc"

