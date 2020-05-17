SUMMARY = "NPM: @stylelint/postcss-css-in-js"
DESCRIPTION = "PostCSS syntax for parsing CSS in JS literals"
HOMEPAGE = "https://github.com/stylelint/postcss-css-in-js#readme"

DEPENDS = "npm-babel-core-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

SRC_URI = "https://registry.npmjs.org/@stylelint/postcss-css-in-js/-/postcss-css-in-js-0.37.1.tgz"
SRC_URI[md5sum] = "91f4abb96ce7fa3ac075dd9eab277f02"
SRC_URI[sha256sum] = "2bd74b545192a86f11cc45f507b5957cab65a660bf4dea77155b62594591ef2a"

NPM_PKGNAME = "@stylelint/postcss-css-in-js"

inherit npmhelper
inherit native
