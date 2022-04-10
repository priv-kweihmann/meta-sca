SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.19.7.tgz"
SRC_URI[md5sum] = "bb86fb14206678c02d2186b1a005f4a7"
SRC_URI[sha256sum] = "56a3551d477ca76937461d412f11f718698a7fedd6259d49c9fb1b2dbb39a990"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
