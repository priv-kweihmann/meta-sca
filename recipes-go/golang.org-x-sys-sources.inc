SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.40.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.40.0;downloadfilename=golang-org-x-sys-0.40.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "d7f9fe44300fc8d47b30d06cd001d9c62c54c6119818a19a2e33a93538971669"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

