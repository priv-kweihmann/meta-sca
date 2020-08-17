SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.12.tgz"
SRC_URI[md5sum] = "77e86fbbd8c8c00c0216266e059819fd"
SRC_URI[sha256sum] = "1763c299d6c0b30d04352304f8b3bed27e31e9b7e2ea17f2b94f2ea617ee3a79"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
