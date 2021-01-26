SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.2.2.tgz"
SRC_URI[md5sum] = "d226b9302736df28c116da6921fe9981"
SRC_URI[sha256sum] = "699a8c49650bb9e94cf9cd43e85320f7a6ffe3bd92b22dc33d41c2908886db2f"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
