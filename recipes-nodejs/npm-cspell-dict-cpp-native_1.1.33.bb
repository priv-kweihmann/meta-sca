SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.33.tgz"
SRC_URI[md5sum] = "97c03f683de3e60e4a47b260209f83dd"
SRC_URI[sha256sum] = "08982b205a5a106ee2aeb9dfa5a2d242d57f576703ee8a4495c90230b3f706d3"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
