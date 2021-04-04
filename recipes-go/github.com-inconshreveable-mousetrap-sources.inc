SRC_URI += "https://proxy.golang.org/github.com/inconshreveable/mousetrap/@v/v1.0.0.zip;srcoutput=github.com/inconshreveable/mousetrap;srcinput=github.com/inconshreveable/mousetrap@v1.0.0;downloadfilename=github-com-inconshreveable-mousetrap-1.0.0.zip;name=github-com-inconshreveable-mousetrap"
SRC_URI[github-com-inconshreveable-mousetrap.sha256sum] = "c3fa0813e78f5cef10dc0e9912c43e68e06ff970a98e98c4050fe14dbbfd18c7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/inconshreveable/mousetrap/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
"

GOSRC_INCLUDEGUARD += "github.com-inconshreveable-mousetrap-sources.inc"

