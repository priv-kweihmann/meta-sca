SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.21.tgz"
SRC_URI[md5sum] = "4759d3402a9c8c227635a5cd340d98af"
SRC_URI[sha256sum] = "d9dd3891891a23f082849bc6092a2388199438fa8c12744d891de010bc1d04cc"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
