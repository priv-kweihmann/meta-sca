SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.50.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.50.0;downloadfilename=golang-org-x-sys-0.50.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b115e8a144a7c9d1df3ffb8af20b283e162844b5b624a97ee342955cca69b9e6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

