SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.29.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.29.0;downloadfilename=golang-org-x-sys-0.29.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "1d759c017d09328a4dacdd4a1a0170cf21641995c6e3ca1f96213369d73c6846"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

