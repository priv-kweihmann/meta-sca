SUMMARY = "NPM: figures"
DESCRIPTION = "Unicode symbols with Windows CMD fallbacks"
HOMEPAGE = "https://github.com/sindresorhus/figures#readme"

DEPENDS = "npm-escape-string-regexp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

SRC_URI = "https://registry.npmjs.org/figures/-/figures-3.2.0.tgz"
SRC_URI[md5sum] = "fa9a3ebe5d94411b366d05173b5c155c"
SRC_URI[sha256sum] = "6d4f6d388e34909cb59cb6eaafaa025857b02cf298b22766a2cb96fd4df2ecdf"

NPM_PKGNAME = "figures"

inherit npmhelper
inherit native
