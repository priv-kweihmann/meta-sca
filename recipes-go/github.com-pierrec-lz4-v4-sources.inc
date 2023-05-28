SRC_URI += "https://proxy.golang.org/github.com/pierrec/lz4/v4/@v/v4.1.17.zip;srcoutput=github.com/pierrec/lz4/v4;srcinput=github.com/pierrec/lz4/v4@v4.1.17;downloadfilename=github-com-pierrec-lz4-v4-4.1.17.zip;name=github-com-pierrec-lz4-v4"
SRC_URI[github-com-pierrec-lz4-v4.sha256sum] = "e79e3d8780c9ebe83d511ccef6fa2e708a5cdbb3e29ddc49ab912f1693978d12"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/v4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-v4-sources.inc"

