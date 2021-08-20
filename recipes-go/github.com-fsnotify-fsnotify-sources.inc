SRC_URI += "https://proxy.golang.org/github.com/fsnotify/fsnotify/@v/v1.5.0.zip;srcoutput=github.com/fsnotify/fsnotify;srcinput=github.com/fsnotify/fsnotify@v1.5.0;downloadfilename=github-com-fsnotify-fsnotify-1.5.0.zip;name=github-com-fsnotify-fsnotify"
SRC_URI[github-com-fsnotify-fsnotify.sha256sum] = "bf02ba07ac940b4eb30759c0be3beda7d3ad923e7c0a2485439ed19a7f5028b2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fsnotify/fsnotify/LICENSE;md5=68f2948d3c4943313d07e084a362486c \
"

GOSRC_INCLUDEGUARD += "github.com-fsnotify-fsnotify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
