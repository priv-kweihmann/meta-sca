SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.2.0.tgz"
SRC_URI[md5sum] = "ddf074bb1eb9547d9f685d8930ca1c41"
SRC_URI[sha256sum] = "2f52650354ad1430edf7421f02a9c60cc7391875afc3f9658b2bbdf08a90047d"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
