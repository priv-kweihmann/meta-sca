SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.33.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.33.0;downloadfilename=golang-org-x-sys-0.33.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "182df79c87135f6dbd0d45656b6527e9221e28899ee44cc6cc7e7a396aedaef9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

