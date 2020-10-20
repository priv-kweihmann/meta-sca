SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.28.tgz"
SRC_URI[md5sum] = "497fdb6166b1d525cb81b0e20118f80e"
SRC_URI[sha256sum] = "a4f1a812038943e74aa93f7fd0b97e8c25bfcfa5cd29162f30264880e6f1abf1"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
