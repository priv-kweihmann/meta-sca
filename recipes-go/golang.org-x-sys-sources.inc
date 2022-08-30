SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220829200755-d48e67d00261.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220829200755-d48e67d00261;downloadfilename=golang-org-x-sys-0.0.0-20220829200755-d48e67d00261.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "15b89567f451d08c4802e5fd0f7b4d529bc3970cfff6bcf9c334c2fa690d81fc"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

