SRC_URI += "https://proxy.golang.org/github.com/emirpasic/gods/@v/v1.18.0.zip;srcoutput=github.com/emirpasic/gods;srcinput=github.com/emirpasic/gods@v1.18.0;downloadfilename=github-com-emirpasic-gods-1.18.0.zip;name=github-com-emirpasic-gods"
SRC_URI[github-com-emirpasic-gods.sha256sum] = "c355c0c0248ccc363f43829ee7e2f0c1698bcf46e3fc7f1aad8156ea67434ccd"

GOSRC_LICENSE += "\
    BSD-2-Clause \
    ISC \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/emirpasic/gods/LICENSE;md5=fedf3d71a271b921fbaa2734cfbed74c \
"

GOSRC_INCLUDEGUARD += "github.com-emirpasic-gods-sources.inc"

