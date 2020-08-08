SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.0.3.tgz"
SRC_URI[md5sum] = "b6059b81c8b4ba1f1ef046bbc682beb2"
SRC_URI[sha256sum] = "5b2bf95d91699b887fea5474147fc7e90ab973de08c45fc4442faeb4c2856c0b"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
