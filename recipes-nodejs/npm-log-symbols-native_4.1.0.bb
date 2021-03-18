SUMMARY = "NPM: log-symbols"
DESCRIPTION = "Colored symbols for various log levels. Example: `✔︎ Success`"
HOMEPAGE = "https://github.com/sindresorhus/log-symbols#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-chalk-native \
           npm-is-unicode-supported-native"

SRC_URI = "https://registry.npmjs.org/log-symbols/-/log-symbols-4.1.0.tgz"
SRC_URI[md5sum] = "6b7e77c65213bd66f0e775dd1a501ef1"
SRC_URI[sha256sum] = "32e706aac11b2ba4c0e9647a3a6738bcd9eb6615bf8ad9f157282e8ed9701323"

NPM_PKGNAME = "log-symbols"

inherit npmhelper
inherit native
