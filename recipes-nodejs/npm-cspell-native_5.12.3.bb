SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"

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
           npm-strip-ansi-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.12.3.tgz"
SRC_URI[md5sum] = "bceacd5da5f750ea86ec9bd1a356703f"
SRC_URI[sha256sum] = "fb030352b2c0d4a9756aeeb16a4dd7ced5e96a34ce7c9e41f6b782f8633f9147"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
