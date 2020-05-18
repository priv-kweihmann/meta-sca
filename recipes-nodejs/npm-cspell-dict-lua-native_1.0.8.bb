SUMMARY = "NPM: cspell-dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lua#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lua/-/cspell-dict-lua-1.0.8.tgz"
SRC_URI[md5sum] = "91679994b1f7f52ed922c22483e08eec"
SRC_URI[sha256sum] = "483a0ea35c21a173d8ed5f5017f628ee052604d380430e0340b36aeb988878ca"

NPM_PKGNAME = "cspell-dict-lua"

inherit npmhelper
inherit native
