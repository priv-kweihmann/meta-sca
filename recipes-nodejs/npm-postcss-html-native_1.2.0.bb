SUMMARY = "NPM: postcss-html"
DESCRIPTION = "PostCSS syntax for parsing HTML (and HTML-like)"
HOMEPAGE = "https://github.com/ota-meshi/postcss-html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8dc045fd8da5f5d84ad9bf5c7f2d2fa0"

DEPENDS = "npm-htmlparser2-native \
           npm-postcss-native \
           npm-postcss-safe-parser-native"

SRC_URI = "https://registry.npmjs.org/postcss-html/-/postcss-html-1.2.0.tgz"
SRC_URI[md5sum] = "a7eac141eb341b77e480212b166a4bdc"
SRC_URI[sha256sum] = "6e7fdfaf913756f18ebaea0f9d9714863824ae40347045d4574f21ea6a7b947a"

NPM_PKGNAME = "postcss-html"

inherit npmhelper
inherit native
