SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.29.tgz"
SRC_URI[md5sum] = "dbac81456d9d916a168f7f18d74e703d"
SRC_URI[sha256sum] = "6eaa63fe99c67924f322a19a54faabe545514a26ce4856ab0531342f8a63fddb"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
