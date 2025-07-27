SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.16.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.16.0;downloadfilename=golang-org-x-sync-0.16.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "ca43984183eb14f7f50d33da350312fed1c42e106dceac2437bfd5084b497dcd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

