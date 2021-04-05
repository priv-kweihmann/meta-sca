SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.11.tgz"
SRC_URI[md5sum] = "3352068783d0941eaafe9a32ac71b361"
SRC_URI[sha256sum] = "bb418842128010b16411d06e3276aa367bea5db926f08f15288391c5d0890adc"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
