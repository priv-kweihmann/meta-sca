SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.13.2.tgz"
SRC_URI[md5sum] = "b422baa5753b8b1e2567bd1c8dd32ce2"
SRC_URI[sha256sum] = "9bbf1bce8475715c7f6df2fbb3d4213ab06ca584b4b9ec31ca93b6cbe0a4d9ec"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
