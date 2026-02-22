SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.41.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.41.0;downloadfilename=golang-org-x-sys-0.41.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "c48084c62177045c1091e3cab99aa03ebb003027435ca8bd36bb851340480a40"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

