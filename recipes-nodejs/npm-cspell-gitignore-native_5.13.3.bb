SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.13.3.tgz"
SRC_URI[md5sum] = "36342ac07ae778794aabc844958d4027"
SRC_URI[sha256sum] = "0ac79bc2005404d53ad78a9339a7f6a8b43f664693023b2a71896c0b48f800bf"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
