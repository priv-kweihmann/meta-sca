SRC_URI += "https://proxy.golang.org/github.com/emirpasic/gods/@v/v1.12.0.zip;srcoutput=github.com/emirpasic/gods;srcinput=github.com/emirpasic/gods@v1.12.0;downloadfilename=github-com-emirpasic-gods-1.12.0.zip;name=github-com-emirpasic-gods"
SRC_URI[github-com-emirpasic-gods.sha256sum] = "729ea0bda86bf801b61ff66eb019e5b9adc559cd217944abf10bb103fca573ee"

GOSRC_LICENSE += "\
    BSD-2-Clause \
    ISC \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/emirpasic/gods/LICENSE;md5=fedf3d71a271b921fbaa2734cfbed74c \
"

GOSRC_INCLUDEGUARD += "github.com-emirpasic-gods-sources.inc"

