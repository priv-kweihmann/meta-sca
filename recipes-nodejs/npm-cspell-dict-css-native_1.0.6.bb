SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/css#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.0.6.tgz"
SRC_URI[md5sum] = "742e853061b9a65e00bd8ac0cbda7716"
SRC_URI[sha256sum] = "8871e1a3a347b9f9ea4a1dca04f5c80fbdca0ef44b82c3edb10707d5edf4565a"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
