SRC_URI += "https://proxy.golang.org/github.com/fsnotify/fsnotify/@v/v1.6.0.zip;srcoutput=github.com/fsnotify/fsnotify;srcinput=github.com/fsnotify/fsnotify@v1.6.0;downloadfilename=github-com-fsnotify-fsnotify-1.6.0.zip;name=github-com-fsnotify-fsnotify"
SRC_URI[github-com-fsnotify-fsnotify.sha256sum] = "7d4408f12ffc38106e358244446851a28077ed80e3c0940e98e0e332b3ed43ab"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fsnotify/fsnotify/LICENSE;md5=8bae8b116e2cfd723492b02d9a212fe2 \
"

GOSRC_INCLUDEGUARD += "github.com-fsnotify-fsnotify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
