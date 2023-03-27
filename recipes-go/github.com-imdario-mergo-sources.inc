SRC_URI += "https://proxy.golang.org/github.com/imdario/mergo/@v/v0.3.15.zip;srcoutput=github.com/imdario/mergo;srcinput=github.com/imdario/mergo@v0.3.15;downloadfilename=github-com-imdario-mergo-0.3.15.zip;name=github-com-imdario-mergo"
SRC_URI[github-com-imdario-mergo.sha256sum] = "a498142112f37066aa3e2b0fc17c4bbcc71b274793313999c391b7475f39bc0d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
"

GOSRC_INCLUDEGUARD += "github.com-imdario-mergo-sources.inc"

