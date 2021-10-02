SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-4.0.1.tgz"
SRC_URI[md5sum] = "11599657366ce2a67dbedcee5723fffa"
SRC_URI[sha256sum] = "7d2cfcd7d2d70b5a290fc9838188c7077fadcb8fd497a5d1ed7a379664f14500"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
