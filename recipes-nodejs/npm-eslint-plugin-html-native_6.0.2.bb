SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.0.2.tgz"
SRC_URI[md5sum] = "9f3e0d6cd4cc51e3b031a9c621fd5840"
SRC_URI[sha256sum] = "19da9e7cf5121e45305d0aaae63de7404971aacb0a8b31fcac4edc521aa8b6e0"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
