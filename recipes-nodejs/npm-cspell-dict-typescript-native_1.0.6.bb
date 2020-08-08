SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.6.tgz"
SRC_URI[md5sum] = "6e4d03bbf8cc6a99edb6f58242d23fb1"
SRC_URI[sha256sum] = "0cb6b54296205c0d6014929baf9a0d73c74826cfab1b6819960c1af348a9f11c"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
