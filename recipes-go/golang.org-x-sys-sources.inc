SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.43.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.43.0;downloadfilename=golang-org-x-sys-0.43.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "cb8b073934cf7e579c9f80c4d12619d5f96fcf97af6f07fdc649e7acec0aaddf"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

