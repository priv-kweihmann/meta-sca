SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.18.3.tgz"
SRC_URI[md5sum] = "fc2fe0ad4ae9319688ead917d4634d6d"
SRC_URI[sha256sum] = "6796b7b53e9e4fcf10e80e3a58e9423c07d77557d0acb695a9d7bbbb853161ab"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
