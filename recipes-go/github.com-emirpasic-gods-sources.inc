SRC_URI += "https://proxy.golang.org/github.com/emirpasic/gods/@v/v1.18.1.zip;srcoutput=github.com/emirpasic/gods;srcinput=github.com/emirpasic/gods@v1.18.1;downloadfilename=github-com-emirpasic-gods-1.18.1.zip;name=github-com-emirpasic-gods"
SRC_URI[github-com-emirpasic-gods.sha256sum] = "1d75e291ac15cf9ca2fcd8bd24e2f7203abad319cd3622cd1b19db5c4fb9daa5"

GOSRC_LICENSE += "\
    BSD-2-Clause \
    ISC \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/emirpasic/gods/LICENSE;md5=fedf3d71a271b921fbaa2734cfbed74c \
"

GOSRC_INCLUDEGUARD += "github.com-emirpasic-gods-sources.inc"

