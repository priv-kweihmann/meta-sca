SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.8.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.8;downloadfilename=github-com-pierrec-lz4-4.1.8.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "4a92ad5709aa2bedf929dafcee6e86c276fcff65ba6ba1e47184a3989b40810c"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

