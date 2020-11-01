SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.11.tgz"
SRC_URI[md5sum] = "1daf5bb1341f10a09983f6751fd5ebee"
SRC_URI[sha256sum] = "5c13d858d36abf949b7a44c08887688c209a5c0dc775ba69ff06c1b8722cb169"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
