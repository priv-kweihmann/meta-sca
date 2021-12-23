SUMMARY = "NPM: eslint-plugin-xss"
DESCRIPTION = "Validates XSS related issues of mixing HTML and non-HTML content in variables."
HOMEPAGE = "https://github.com/Rantanen/eslint-plugin-xss#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=631c05fa716ed6389c47022bc85d1c6e"

DEPENDS = "npm-requireindex-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-xss/-/eslint-plugin-xss-0.1.11.tgz"
SRC_URI[md5sum] = "2fe11cf0c93174ab742ae60cb7db6a90"
SRC_URI[sha256sum] = "5e0fdf40e2cef2f1635293c3ee06c104e1d0d54792d2e5b10251a7ec372a586c"

NPM_PKGNAME = "eslint-plugin-xss"

inherit npmhelper
inherit native
