SUMMARY = "NPM: empower"
DESCRIPTION = "Power Assert feature enhancer for assert function/object"
HOMEPAGE = "https://github.com/power-assert-js/empower"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=57353d744279f0e324636d7d839d5190"

DEPENDS = "npm-core-js-native \
           npm-empower-core-native"

SRC_URI = "https://registry.npmjs.org/empower/-/empower-1.3.1.tgz"
SRC_URI[md5sum] = "e6e93ba0b161a5fbe667d6f9c0b83119"
SRC_URI[sha256sum] = "00eda0a4b68e73a13cead34fe7a892df7a235ea63f8ad0a836786e5567ebb9a0"

NPM_PKGNAME = "empower"

inherit npmhelper
inherit native
