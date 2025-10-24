SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.37.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.37.0;downloadfilename=golang-org-x-sys-0.37.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "6c87bb94ec328b6d6234ad02cf2813225fe3bd5f8929fe85775ca06e01cfcc78"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

