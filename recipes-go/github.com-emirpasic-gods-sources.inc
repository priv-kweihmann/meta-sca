SRC_URI += "https://proxy.golang.org/github.com/emirpasic/gods/@v/v1.12.1.zip;srcoutput=github.com/emirpasic/gods;srcinput=github.com/emirpasic/gods@v1.12.1;downloadfilename=github-com-emirpasic-gods-1.12.1.zip;name=github-com-emirpasic-gods"
SRC_URI[github-com-emirpasic-gods.sha256sum] = "8b4b12237c9a6339e96db96b8b6dca345057bd3cd856014ea109d1ecbea7de1f"

GOSRC_LICENSE += "\
    BSD-2-Clause \
    ISC \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/emirpasic/gods/LICENSE;md5=fedf3d71a271b921fbaa2734cfbed74c \
"

GOSRC_INCLUDEGUARD += "github.com-emirpasic-gods-sources.inc"

