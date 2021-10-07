SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.12.2.tgz"
SRC_URI[md5sum] = "53ea689462eb1ec3e9235250eb582f2a"
SRC_URI[sha256sum] = "6c251f970e7f1a153b56a060591c295c0020c698e912fcf06e425b3f11be2da1"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
