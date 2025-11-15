SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.38.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.38.0;downloadfilename=golang-org-x-sys-0.38.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "dacd7c9aa2b298f966822da214c6d601da08f14d41b29032bcac4bc503887a49"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

