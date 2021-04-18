SUMMARY = "NPM: log-symbols"
DESCRIPTION = "Colored symbols for various log levels. Example: `✔︎ Success`"
HOMEPAGE = "https://github.com/sindresorhus/log-symbols#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-chalk-native \
           npm-is-unicode-supported-native"

SRC_URI = "https://registry.npmjs.org/log-symbols/-/log-symbols-5.0.0.tgz"
SRC_URI[md5sum] = "23382b7b80de8d1cb659dbd0a1dec900"
SRC_URI[sha256sum] = "723abd04e0ea2812edaa63dda1941becbe399d07b7edd0e73f6329669a913daf"

NPM_PKGNAME = "log-symbols"

inherit npmhelper
inherit native
