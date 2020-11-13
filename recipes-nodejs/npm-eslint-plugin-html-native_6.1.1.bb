SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.1.1.tgz"
SRC_URI[md5sum] = "bfea8c1676fccac72ace08475b923f51"
SRC_URI[sha256sum] = "8f795ad2165405277b7b5e4f1af0371f06d1d8857d0d567704856658272d1722"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
