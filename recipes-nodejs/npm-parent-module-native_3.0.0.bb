SUMMARY = "NPM: parent-module"
DESCRIPTION = "Get the path of the parent module"
HOMEPAGE = "https://github.com/sindresorhus/parent-module#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-callsites-native"

SRC_URI = "https://registry.npmjs.org/parent-module/-/parent-module-3.0.0.tgz"
SRC_URI[md5sum] = "1a664f4763db737d7d40380bda6fbfcf"
SRC_URI[sha256sum] = "e3d396bf7a4ad96fbe53100921c37590f3a9766f2762be6d7f4d90f9c411c997"

NPM_PKGNAME = "parent-module"

inherit npmhelper
inherit native
