SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/npm#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.8.tgz"
SRC_URI[md5sum] = "a8bd502a1521fefa3fb8fbb77f9f6aba"
SRC_URI[sha256sum] = "126b40901d492232db30b2d85ecab7c94e9c462ce3e3a86dcb9c1294f7320c09"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
