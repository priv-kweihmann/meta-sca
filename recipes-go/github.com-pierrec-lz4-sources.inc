SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.11.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.11;downloadfilename=github-com-pierrec-lz4-4.1.11.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "90dfa924fe281f6ec1ae2b17f5720d97a8a6bd211895bcb6595d8b247cd72768"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

