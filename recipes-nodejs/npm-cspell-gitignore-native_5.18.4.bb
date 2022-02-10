SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.18.4.tgz"
SRC_URI[md5sum] = "afbbbde4c8ab37c478f6e60e3382bbe7"
SRC_URI[sha256sum] = "86fc68a4bf50ed9e59f2f8ca1ebdddbe8e58d9b960bcb8bdb53b79d52c6b692b"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
