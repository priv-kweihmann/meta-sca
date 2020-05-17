SUMMARY = "NPM: postcss-html"
DESCRIPTION = "PostCSS syntax for parsing HTML (and HTML-like)"
HOMEPAGE = "https://github.com/gucong3000/postcss-html#readme"

DEPENDS = "npm-htmlparser2-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

SRC_URI = "https://registry.npmjs.org/postcss-html/-/postcss-html-0.36.0.tgz"
SRC_URI[md5sum] = "aeba1ac40a8643cf846c9c8e35054b01"
SRC_URI[sha256sum] = "9e73da130b2494a10b8b3adfdd338f0f7db187c746e3da0d1b701af3f349ba2d"

NPM_PKGNAME = "postcss-html"

inherit npmhelper
inherit native
