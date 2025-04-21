SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.32.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.32.0;downloadfilename=golang-org-x-sys-0.32.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "85d47075d21fd7ef35d9a47fc73f2356fb3cd2e7fab7f45c874b814bf312127d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

