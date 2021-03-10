SUMMARY = "NPM: eslint-plugin-html"
DESCRIPTION = "A ESLint plugin to lint and fix inline scripts contained in HTML files."
HOMEPAGE = "https://github.com/BenoitZugmeyer/eslint-plugin-html"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85a25fb9d1ed987d1a805e467bd53f02"

DEPENDS = "npm-htmlparser2-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-html/-/eslint-plugin-html-6.1.2.tgz"
SRC_URI[md5sum] = "60571b5d4715cbf09bc1b20ecd370f51"
SRC_URI[sha256sum] = "2b1ec92687fa961d9de9387221a4ed78327dd692df65f21d2783fb23edc6b6ec"

NPM_PKGNAME = "eslint-plugin-html"

inherit npmhelper
inherit native
