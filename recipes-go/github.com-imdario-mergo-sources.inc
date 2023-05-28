SRC_URI += "https://proxy.golang.org/github.com/imdario/mergo/@v/v0.3.16.zip;srcoutput=github.com/imdario/mergo;srcinput=github.com/imdario/mergo@v0.3.16;downloadfilename=github-com-imdario-mergo-0.3.16.zip;name=github-com-imdario-mergo"
SRC_URI[github-com-imdario-mergo.sha256sum] = "536b0b87ec2b9f02d759a3a01604043b538e15e62924a29e34cfc2b16a1cf580"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/imdario/mergo/LICENSE;md5=ff13e03bb57bf9c52645f2f942afa28b \
"

GOSRC_INCLUDEGUARD += "github.com-imdario-mergo-sources.inc"

