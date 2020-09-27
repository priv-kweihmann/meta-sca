SUMMARY = "NPM: postcss-scss"
DESCRIPTION = "SCSS parser for PostCSS"
HOMEPAGE = "https://github.com/postcss/postcss-scss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-postcss-native"

SRC_URI = "https://registry.npmjs.org/postcss-scss/-/postcss-scss-3.0.2.tgz"
SRC_URI[md5sum] = "10e11b26f9fbebd1dff6042e4670362e"
SRC_URI[sha256sum] = "eaa4f9f76fd14ce1e7173b2505aee39b9ae3bf3e5b133f2b84e2328fa0c6b124"

NPM_PKGNAME = "postcss-scss"

inherit npmhelper
inherit native
