SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220227234510-4e6760a101f9.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220227234510-4e6760a101f9;downloadfilename=golang-org-x-sys-0.0.0-20220227234510-4e6760a101f9.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e5c12965b8256c2e74f9baedcfd286a7a67a7ebeb2fe1af70e32e4464d1670df"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

