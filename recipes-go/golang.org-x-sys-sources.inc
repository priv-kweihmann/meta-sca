SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220615213510-4f61da869c0c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220615213510-4f61da869c0c;downloadfilename=golang-org-x-sys-0.0.0-20220615213510-4f61da869c0c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "5b23b3190363ad03f5b9f42f47872cd30936fb93a95ac3f188ed23458679920c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

