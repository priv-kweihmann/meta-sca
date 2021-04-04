SRC_URI += "https://proxy.golang.org/github.com/golang/snappy/@v/v0.0.3.zip;srcoutput=github.com/golang/snappy;srcinput=github.com/golang/snappy@v0.0.3;downloadfilename=github-com-golang-snappy-0.0.3.zip;name=github-com-golang-snappy"
SRC_URI[github-com-golang-snappy.sha256sum] = "f6b5e35bd1e1d35b5a67c8a91bf76d403426ce3669783af82b66c0254e4e0da5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/snappy/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-snappy-sources.inc"

