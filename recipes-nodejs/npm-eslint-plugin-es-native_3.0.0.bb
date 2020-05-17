SUMMARY = "NPM: eslint-plugin-es"
DESCRIPTION = "ESLint plugin about ECMAScript syntactic features."
HOMEPAGE = "https://github.com/mysticatea/eslint-plugin-es#readme"

DEPENDS = "npm-eslint-utils-native npm-regexpp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-es/-/eslint-plugin-es-3.0.0.tgz"
SRC_URI[md5sum] = "917e12825cad2e81301265185fb50df0"
SRC_URI[sha256sum] = "67056665737a8f5a1d30f871d987d443cce81181562a5d181aecb969be797de4"

NPM_PKGNAME = "eslint-plugin-es"

inherit npmhelper
inherit native
