SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/cpp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.2.5.tgz"
SRC_URI[md5sum] = "1cce6a430233a5a7dc04b6d6f9f1c3d6"
SRC_URI[sha256sum] = "d5157bbe0f54169df9b05fca91a69196968f370a3669e89db64b3d3537f36d5e"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
