SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220919091848-fb04ddd9f9c8.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220919091848-fb04ddd9f9c8;downloadfilename=golang-org-x-sys-0.0.0-20220919091848-fb04ddd9f9c8.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "4aeeb830ccb9693edde1127a1498a52f3d715664e091a033f99c4647a60f0032"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

