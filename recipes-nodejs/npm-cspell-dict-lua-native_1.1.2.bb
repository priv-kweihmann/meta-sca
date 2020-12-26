SUMMARY = "NPM: cspell-dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lua#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lua/-/cspell-dict-lua-1.1.2.tgz"
SRC_URI[md5sum] = "a7864b6ad9bba3956b70510319c1fd49"
SRC_URI[sha256sum] = "72003a033219f86fe839b36253206512d355831b13283f746f01ded8d6396663"

NPM_PKGNAME = "cspell-dict-lua"

inherit npmhelper
inherit native
