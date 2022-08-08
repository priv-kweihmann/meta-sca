SRC_URI += "https://proxy.golang.org/github.com/inconshreveable/mousetrap/@v/v1.0.1.zip;srcoutput=github.com/inconshreveable/mousetrap;srcinput=github.com/inconshreveable/mousetrap@v1.0.1;downloadfilename=github-com-inconshreveable-mousetrap-1.0.1.zip;name=github-com-inconshreveable-mousetrap"
SRC_URI[github-com-inconshreveable-mousetrap.sha256sum] = "af6f61a00f42d025f195ea272620bbddb045552a9badcf97d8a837980017dbfc"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/inconshreveable/mousetrap/LICENSE;md5=7ea8c6c3cf90c1ca8494325e32c35579 \
"

GOSRC_INCLUDEGUARD += "github.com-inconshreveable-mousetrap-sources.inc"

