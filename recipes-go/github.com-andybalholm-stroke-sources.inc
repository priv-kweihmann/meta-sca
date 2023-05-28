SRC_URI += "https://proxy.golang.org/github.com/andybalholm/stroke/@v/v0.0.0-20221221101821-bd29b49d73f0.zip;srcoutput=github.com/andybalholm/stroke;srcinput=github.com/andybalholm/stroke@v0.0.0-20221221101821-bd29b49d73f0;downloadfilename=github-com-andybalholm-stroke-0.0.0-20221221101821-bd29b49d73f0.zip;name=github-com-andybalholm-stroke"
SRC_URI[github-com-andybalholm-stroke.sha256sum] = "f9c137a3a7adfc329a6484a3df83efaeb9f434e2ee6a3196e6d0e9bf957ba662"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/andybalholm/stroke/LICENSE;md5=0c6c6be7e5026d35be89bdc004e1f870 \
"

GOSRC_INCLUDEGUARD += "github.com-andybalholm-stroke-sources.inc"

