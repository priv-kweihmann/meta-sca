SUMMARY = "NPM: global-prefix"
DESCRIPTION = "Get the npm global path prefix."
HOMEPAGE = "https://github.com/jonschlinkert/global-prefix"

DEPENDS = "npm-ini-native npm-kind-of-native npm-which-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

SRC_URI = "https://registry.npmjs.org/global-prefix/-/global-prefix-3.0.0.tgz"
SRC_URI[md5sum] = "182562fc357ccbf8df7eacf93af2b8b4"
SRC_URI[sha256sum] = "6617431f852031fec749fd548c648f34fab831874e1739b91924cc111bac5a73"

NPM_PKGNAME = "global-prefix"

inherit npmhelper
inherit native
