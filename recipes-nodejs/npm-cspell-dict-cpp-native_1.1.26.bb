SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.26.tgz"
SRC_URI[md5sum] = "0dab70e21eefe37a862780e4cffeb027"
SRC_URI[sha256sum] = "5d1a8249c35432623d680a71e405444e09ed6f393098d54dfee7bc562295e2e8"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
