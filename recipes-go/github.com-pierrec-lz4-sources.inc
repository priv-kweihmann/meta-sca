SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.10.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.10;downloadfilename=github-com-pierrec-lz4-4.1.10.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "fd3b4b007f992c9ea2625257197b2407c5e889603b3ea42b1a32395eaf18680d"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

