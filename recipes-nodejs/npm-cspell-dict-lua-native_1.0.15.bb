SUMMARY = "NPM: cspell-dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lua#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lua/-/cspell-dict-lua-1.0.15.tgz"
SRC_URI[md5sum] = "6212a3f4cb5dffccfd0b9f3ecb9d06a5"
SRC_URI[sha256sum] = "bd86e27a4a2db7d2f3ff774cbd94f44278e5e183b2562afff6b704c2450834a6"

NPM_PKGNAME = "cspell-dict-lua"

inherit npmhelper
inherit native
