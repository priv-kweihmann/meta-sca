SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.1.0.tgz"
SRC_URI[md5sum] = "1269138516c17d5dbbb4727c66f7930b"
SRC_URI[sha256sum] = "5d0758537e4dc311c9e9e151c60a1452b23a6454d08a9aac9a7a3709768f94dd"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
