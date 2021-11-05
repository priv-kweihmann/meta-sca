SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.12.6.tgz"
SRC_URI[md5sum] = "ec4825bce8312f74108b5ed5f4a2192e"
SRC_URI[sha256sum] = "4a86368742d3d2f607ba6779b22bfcf8ccebfeecb9f970750d19bc9567033bd2"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
