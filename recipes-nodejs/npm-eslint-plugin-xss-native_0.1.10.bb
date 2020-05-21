SUMMARY = "NPM: eslint-plugin-xss"
DESCRIPTION = "Validates XSS related issues of mixing HTML and non-HTML content in variables."
HOMEPAGE = "https://github.com/Rantanen/eslint-plugin-xss#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=631c05fa716ed6389c47022bc85d1c6e"

DEPENDS = "npm-requireindex-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-xss/-/eslint-plugin-xss-0.1.10.tgz"
SRC_URI[md5sum] = "7037ce9cc8e72c058fb26bfec707bd02"
SRC_URI[sha256sum] = "28eb72ace37ece421762748c91ef77624da575d11c16da6140bff94d8963ca1e"

NPM_PKGNAME = "eslint-plugin-xss"

inherit npmhelper
inherit native
