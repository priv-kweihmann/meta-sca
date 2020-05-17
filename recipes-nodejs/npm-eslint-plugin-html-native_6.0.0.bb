SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

DEPENDS = "npm-htmlparser2-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.0.0.tgz"
SRC_URI[md5sum] = "2788852e29de9229739a0108b4716e26"
SRC_URI[sha256sum] = "f628a8d91eddb75869d937501ac55ba8c390b29588b4cc0f634d09a476821065"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
