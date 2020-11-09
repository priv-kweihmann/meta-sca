SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.12.tgz"
SRC_URI[md5sum] = "d1e3d023998ba0fdb9b48a38a1d2c1d0"
SRC_URI[sha256sum] = "5006f72f08534d950fd24cbddb84d3cc58430ebed58f1b81c5ae33aa67ff4407"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
