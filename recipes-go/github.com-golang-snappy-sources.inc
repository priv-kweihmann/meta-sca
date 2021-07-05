SRC_URI += "https://proxy.golang.org/github.com/golang/snappy/@v/v0.0.4.zip;srcoutput=github.com/golang/snappy;srcinput=github.com/golang/snappy@v0.0.4;downloadfilename=github-com-golang-snappy-0.0.4.zip;name=github-com-golang-snappy"
SRC_URI[github-com-golang-snappy.sha256sum] = "ea4545ca44ee990554094df6de440386a440a5bd99106e048939409d63beb423"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/snappy/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-snappy-sources.inc"

