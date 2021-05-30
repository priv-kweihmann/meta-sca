SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.2.4.tgz"
SRC_URI[md5sum] = "538b7afba75cbbdb649dac2f94271fcc"
SRC_URI[sha256sum] = "e7f565b544a689b5add877272eccae0971c2210f4b3984704e2189e573bc6499"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
