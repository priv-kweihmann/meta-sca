SRC_URI += "https://proxy.golang.org/rsc.io/pdf/@v/v0.1.1.zip;srcoutput=rsc.io/pdf;srcinput=rsc.io/pdf@v0.1.1;downloadfilename=rsc-io-pdf-0.1.1.zip;name=rsc-io-pdf"
SRC_URI[rsc-io-pdf.sha256sum] = "79bf310e399cf0e2d8aa61536750d2a6999c5ca884e7a27faf88d3701cd5ba8f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/rsc.io/pdf/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "rsc.io-pdf-sources.inc"

