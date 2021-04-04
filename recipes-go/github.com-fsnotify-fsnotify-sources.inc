SRC_URI += "https://proxy.golang.org/github.com/fsnotify/fsnotify/@v/v1.4.9.zip;srcoutput=github.com/fsnotify/fsnotify;srcinput=github.com/fsnotify/fsnotify@v1.4.9;downloadfilename=github-com-fsnotify-fsnotify-1.4.9.zip;name=github-com-fsnotify-fsnotify"
SRC_URI[github-com-fsnotify-fsnotify.sha256sum] = "fe48f570801de16bfe973dc74e7e5923ae689ba8c274437f65dbc8a63537f759"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fsnotify/fsnotify/LICENSE;md5=68f2948d3c4943313d07e084a362486c \
"

GOSRC_INCLUDEGUARD += "github.com-fsnotify-fsnotify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
