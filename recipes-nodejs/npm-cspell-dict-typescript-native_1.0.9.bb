SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.9.tgz"
SRC_URI[md5sum] = "b5a908a2c8d0c09e5920227faaa3a230"
SRC_URI[sha256sum] = "58e07c28014cff3ec8c31acf65ecc56876be61c5cdd0313e94206de482b6aa95"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
