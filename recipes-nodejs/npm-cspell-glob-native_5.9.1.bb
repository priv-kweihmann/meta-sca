SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.9.1.tgz"
SRC_URI[md5sum] = "37a2974378aac8ee6a2081ec8424066f"
SRC_URI[sha256sum] = "bac0f591a8cd1e14a7da44f28c87c0059843b959e985a0bd429168a5c0c04cc8"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
