SUMMARY = "NPM: cspell-dict-lua"
DESCRIPTION = "Lua dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/lua#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-lua/-/cspell-dict-lua-1.0.10.tgz"
SRC_URI[md5sum] = "5dca528cc968b07c1e5ae8da7e9e2b3d"
SRC_URI[sha256sum] = "49d588f7e2b077221716d3f90ba59866333f5136e2eabf66fe59e3c787b99340"

NPM_PKGNAME = "cspell-dict-lua"

inherit npmhelper
inherit native
