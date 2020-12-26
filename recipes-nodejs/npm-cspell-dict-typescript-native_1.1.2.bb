SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.1.2.tgz"
SRC_URI[md5sum] = "4de58d4aab6236682c5d7fec0a3c3d2c"
SRC_URI[sha256sum] = "29d08718d70857e9f10a342e99c4d6535c6f3bca43f8e44070b1fd6ae80b03da"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
