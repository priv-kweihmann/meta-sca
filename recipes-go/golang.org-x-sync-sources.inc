SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.19.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.19.0;downloadfilename=golang-org-x-sync-0.19.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "25211fe2cffd8020bb405b9adb7a90f5e06760f2818b8fb2e74aaaa21a66ed9e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

