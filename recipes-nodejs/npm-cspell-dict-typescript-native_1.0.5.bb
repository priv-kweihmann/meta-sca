SUMMARY = "NPM: cspell-dict-typescript"
DESCRIPTION = "TypeScript and JavaScript dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/typescript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-typescript/-/cspell-dict-typescript-1.0.5.tgz"
SRC_URI[md5sum] = "ea9e93616d22579aa1cf6e6f4f4a2c67"
SRC_URI[sha256sum] = "32bf96eebf07266adfec022993a3b3bffe9fd23c752f576945404399224b6ed5"

NPM_PKGNAME = "cspell-dict-typescript"

inherit npmhelper
inherit native
