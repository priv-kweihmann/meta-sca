SRC_URI += "https://proxy.golang.org/github.com/inconshreveable/mousetrap/@v/v1.1.0.zip;srcoutput=github.com/inconshreveable/mousetrap;srcinput=github.com/inconshreveable/mousetrap@v1.1.0;downloadfilename=github-com-inconshreveable-mousetrap-1.1.0.zip;name=github-com-inconshreveable-mousetrap"
SRC_URI[github-com-inconshreveable-mousetrap.sha256sum] = "526674de624d7db108cfe7653ef110ccdfd97bc85026254224815567928ed243"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/inconshreveable/mousetrap/LICENSE;md5=7ea8c6c3cf90c1ca8494325e32c35579 \
"

GOSRC_INCLUDEGUARD += "github.com-inconshreveable-mousetrap-sources.inc"

