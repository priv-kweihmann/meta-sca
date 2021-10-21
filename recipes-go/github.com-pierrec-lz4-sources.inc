SRC_URI += "https://github.com/pierrec/lz4/archive/refs/tags/v4.1.9.zip;srcoutput=github.com/pierrec/lz4;srcinput=lz4-4.1.9;downloadfilename=github-com-pierrec-lz4-4.1.9.zip;name=github-com-pierrec-lz4"
SRC_URI[github-com-pierrec-lz4.sha256sum] = "143c2e5748b3d96d0d73b736edfb9fd2a482917b418237ee059149070b4da8db"
GOSRC_REMOVEDIRS += "github.com/pierrec/lz4/cmd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-sources.inc"

