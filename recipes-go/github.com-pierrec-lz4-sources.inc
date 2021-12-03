SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.12.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.12;downloadfilename=github-com-pierrec-lz4-4.1.12.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "b5dba24ced67b56fd795268846f5c223eb5981d9fb9356920c0793f6ff186101"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

