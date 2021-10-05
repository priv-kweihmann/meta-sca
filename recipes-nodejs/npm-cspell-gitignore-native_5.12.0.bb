SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.12.0.tgz"
SRC_URI[md5sum] = "1cee94267e4aa2a53a20af8266243929"
SRC_URI[sha256sum] = "8582ff792880da41af95c3b5a9371a7c4d27e078e81c32674815da7b2dc3f335"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
