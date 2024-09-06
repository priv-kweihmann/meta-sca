SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.25.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.25.0;downloadfilename=golang-org-x-sys-0.25.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "95e485046cac79d164d4d35a13e93b2a866a1ac2148184c37ca71514ddd94a52"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

