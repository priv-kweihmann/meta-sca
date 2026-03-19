SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.42.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.42.0;downloadfilename=golang-org-x-sys-0.42.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "99df0ad90183debc80aee0b7489648574c6baa0c1cf5da37aaf591cf2e2d426a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

