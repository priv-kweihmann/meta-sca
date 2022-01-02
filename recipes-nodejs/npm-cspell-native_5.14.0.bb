SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://streetsidesoftware.github.io/cspell/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.14.0.tgz"
SRC_URI[md5sum] = "7330d59c36c14b95cf9312badd833ad1"
SRC_URI[sha256sum] = "004a54426100cdb2fa1c9a0a696213784e3e921c706880fba74b2585dd016bc1"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
