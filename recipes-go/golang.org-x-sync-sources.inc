SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.12.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.12.0;downloadfilename=golang-org-x-sync-0.12.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "a35481e5ae73e51ef01cf42bcad09c3b73bb3a4abb67d495d4a575021541ed02"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

