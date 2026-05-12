SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.44.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.44.0;downloadfilename=golang-org-x-sys-0.44.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "f1fa1052808e6bd6eb9c5372c053b2370a582532fac5d6a4600e7a6fab190ff3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

