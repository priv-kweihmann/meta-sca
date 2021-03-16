SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.2.3.tgz"
SRC_URI[md5sum] = "b6fe4e00e19cc6e78c8ee855b324cf4f"
SRC_URI[sha256sum] = "e99ffeef32f2a179defff1607f17b979e22d0c4952cb742610b1848bbfff690e"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
