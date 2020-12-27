SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.1.0.tgz"
SRC_URI[md5sum] = "b3eaa40e4cbeeec9cf520672a03443f0"
SRC_URI[sha256sum] = "b31b80a8440d2212c54181efe23125762815e762635a09ae461a19086f966186"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
