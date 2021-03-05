SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-3.0.5.tgz"
SRC_URI[md5sum] = "0d33f77b7a38164c8b955b2cd608e09a"
SRC_URI[sha256sum] = "620d7438b25b12093e1640278573c7a98bcd08ebf01d197ea343092b8b7621db"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
