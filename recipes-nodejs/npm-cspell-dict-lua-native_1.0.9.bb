SUMMARY = "NPM: cspell-dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lua#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lua/-/cspell-dict-lua-1.0.9.tgz"
SRC_URI[md5sum] = "f25dfafbeced1df600cca9eea69d594c"
SRC_URI[sha256sum] = "4617dc19a419ce72830da150d29d0b44982fea8fe1a4b4305b9a0a98d855a013"

NPM_PKGNAME = "cspell-dict-lua"

inherit npmhelper
inherit native
