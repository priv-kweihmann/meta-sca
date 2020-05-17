SUMMARY = "NPM: eslint-plugin-eslint-plugin"
DESCRIPTION = "An ESLint plugin for linting ESLint plugins"
HOMEPAGE = "https://github.com/not-an-aardvark/eslint-plugin-eslint-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0fe5948ec40e15deaf5c01bc0da29119"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-eslint-plugin/-/eslint-plugin-eslint-plugin-2.2.1.tgz"
SRC_URI[md5sum] = "1fb5f0075d74c9d779e0a4c52f2c3272"
SRC_URI[sha256sum] = "cdd879a638d1e1ddff438b981dbdfbef7fc54a011552f9be42ce08f3fb14645a"

NPM_PKGNAME = "eslint-plugin-eslint-plugin"

inherit npmhelper
inherit native
