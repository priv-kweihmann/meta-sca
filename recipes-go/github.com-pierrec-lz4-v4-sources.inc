SRC_URI += "https://proxy.golang.org/github.com/pierrec/lz4/v4/@v/v4.1.18.zip;srcoutput=github.com/pierrec/lz4/v4;srcinput=github.com/pierrec/lz4/v4@v4.1.18;downloadfilename=github-com-pierrec-lz4-v4-4.1.18.zip;name=github-com-pierrec-lz4-v4"
SRC_URI[github-com-pierrec-lz4-v4.sha256sum] = "b397db34ff05610125e7c9de6de067a174a70ba3ba7dac81ba8ce4f22b1c0933"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pierrec/lz4/v4/LICENSE;md5=09ece85f3c312a63b522bfc6ebd44943 \
"

GOSRC_INCLUDEGUARD += "github.com-pierrec-lz4-v4-sources.inc"

