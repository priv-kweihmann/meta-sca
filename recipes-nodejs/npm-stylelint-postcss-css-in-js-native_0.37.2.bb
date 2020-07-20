SUMMARY = "NPM: @stylelint/postcss-css-in-js"
DESCRIPTION = "PostCSS syntax for parsing CSS in JS literals"
HOMEPAGE = "https://github.com/stylelint/postcss-css-in-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

DEPENDS = "npm-babel-core-native"

SRC_URI = "https://registry.npmjs.org/@stylelint/postcss-css-in-js/-/postcss-css-in-js-0.37.2.tgz"
SRC_URI[md5sum] = "fae243e288f245363eeae740ef0276f0"
SRC_URI[sha256sum] = "46e13356f276d9abd5b267288fbb772577f40e50f3cf8e4dc78e72ca1bdd9f0f"

NPM_PKGNAME = "@stylelint/postcss-css-in-js"

inherit npmhelper
inherit native
