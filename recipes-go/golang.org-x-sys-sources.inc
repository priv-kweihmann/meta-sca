SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.28.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.28.0;downloadfilename=golang-org-x-sys-0.28.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "0ed47a83fe7d7a7e743e815172bc10c1ac0ed0d31ebb095e75717428e09aa895"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

