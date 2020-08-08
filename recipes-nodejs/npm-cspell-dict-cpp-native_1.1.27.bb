SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.27.tgz"
SRC_URI[md5sum] = "aa076625fc5a55e2578d5f3cd6cf5b68"
SRC_URI[sha256sum] = "ccba62648547951b5eb58498cf76fa8152e007a83333de7b8ce80adfd01389a0"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
