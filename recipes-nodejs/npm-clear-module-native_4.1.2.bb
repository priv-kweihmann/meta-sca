SUMMARY = "NPM: clear-module"
DESCRIPTION = "Clear a module from the cache"
HOMEPAGE = "https://github.com/sindresorhus/clear-module#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-parent-module-native \
           npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/clear-module/-/clear-module-4.1.2.tgz"
SRC_URI[md5sum] = "df65c2f439c93adc49d3574be6ab3584"
SRC_URI[sha256sum] = "576c2ffcd4b0bba2eae487a808dfcdd8dd5b9a2657ec36749af198a7fdd13c18"

NPM_PKGNAME = "clear-module"

inherit npmhelper
inherit native
