SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220702020025-31831981b65f.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220702020025-31831981b65f;downloadfilename=golang-org-x-sys-0.0.0-20220702020025-31831981b65f.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "dea89e3f74d32e8eb86678a0c6b7e94f4e0ffdf5eca19a4a91b29bcdff199264"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

