SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.19.tgz"
SRC_URI[md5sum] = "48e8161f120b26f2f4daee2f3a2ec86c"
SRC_URI[sha256sum] = "ccde67e221309113ca0541e4d7816b2d3e5e11b808569a88d341cc3d77fc6fe2"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
