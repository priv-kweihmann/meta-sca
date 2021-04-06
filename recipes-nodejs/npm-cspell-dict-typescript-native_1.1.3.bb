SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.1.3.tgz"
SRC_URI[md5sum] = "32a0f5e42a8d0e3be9122d828c3a4594"
SRC_URI[sha256sum] = "ff2cca64683c3949dd548651fc6e45914d31a6c6df4aeab682b66cd92410d0ba"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
