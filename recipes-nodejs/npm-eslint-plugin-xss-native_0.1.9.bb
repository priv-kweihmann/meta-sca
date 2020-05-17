SUMMARY = "NPM: eslint-plugin-xss"
DESCRIPTION = "Validates XSS related issues of mixing HTML and non-HTML content in variables."
HOMEPAGE = "https://github.com/Rantanen/eslint-plugin-xss#readme"

DEPENDS = "npm-requireindex-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=631c05fa716ed6389c47022bc85d1c6e"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-xss/-/eslint-plugin-xss-0.1.9.tgz"
SRC_URI[md5sum] = "8964148777249c4cfb03f3bdb9a00601"
SRC_URI[sha256sum] = "5a9913e73faa7666d81449ad4be5e0557f4412731a960f8157e05d9667427869"

NPM_PKGNAME = "eslint-plugin-xss"

inherit npmhelper
inherit native
