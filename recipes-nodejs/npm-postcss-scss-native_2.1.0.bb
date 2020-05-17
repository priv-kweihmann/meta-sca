SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-2.1.0.tgz"
SRC_URI[md5sum] = "d25f9f00bef3cab7b30347fcab3f2ff6"
SRC_URI[sha256sum] = "427f59319396324e128e7f27f8308c00fccae90018c07bc36de801b5ec5df498"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
