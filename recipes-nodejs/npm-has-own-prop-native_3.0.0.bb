SUMMARY = "NPM: has-own-prop"
DESCRIPTION = "A safer `.hasOwnProperty()`"
HOMEPAGE = "https://github.com/sindresorhus/has-own-prop#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-own-prop/-/has-own-prop-3.0.0.tgz"
SRC_URI[md5sum] = "20648f074a69823b498c56aee425bca7"
SRC_URI[sha256sum] = "2947011232b937b11405a84797670d806d01761d36e9cae7b94077ed17ddb58e"

NPM_PKGNAME = "has-own-prop"

inherit npmhelper
inherit native
