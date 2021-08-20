SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210819135213-f52c844e1c1c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210819135213-f52c844e1c1c;downloadfilename=golang-org-x-sys-0.0.0-20210819135213-f52c844e1c1c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e135d63fd44db8322fd4ca348663d508b87f81e3d30b451af9c542db10494830"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

