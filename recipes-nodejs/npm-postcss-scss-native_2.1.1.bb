SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-2.1.1.tgz"
SRC_URI[md5sum] = "6c190cbe38a71bdb2cd4694320ff0110"
SRC_URI[sha256sum] = "71e964a2f9a568a73b9a799a0a7d94b41f9efd5f90868eeb038ffe09861c7e0d"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
