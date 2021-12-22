SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-gitignore-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fast-json-stable-stringify-native \
           npm-file-entry-cache-native \
           npm-fs-extra-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-imurmurhash-native \
           npm-semver-native \
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.13.4.tgz"
SRC_URI[md5sum] = "a043671b5b794a228acabd05022bc5f9"
SRC_URI[sha256sum] = "508c9bcbd0a93fe9a44a29b8cefb5ca0ce58b31db174d13f6cc6d3360685cbf0"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
