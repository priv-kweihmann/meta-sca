SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.4.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.4;downloadfilename=github-com-pierrec-lz4-4.1.4.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "c3f5a2e500d9553e285720177432387622490f262256acc8666dfa453d165bb5"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

