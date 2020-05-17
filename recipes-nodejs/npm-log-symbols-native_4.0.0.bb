SUMMARY = "NPM: log-symbols"
DESCRIPTION = "Colored symbols for various log levels. Example: `✔︎ Success`"
HOMEPAGE = "https://github.com/sindresorhus/log-symbols#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-chalk-native"

SRC_URI = "https://registry.npmjs.org/log-symbols/-/log-symbols-4.0.0.tgz"
SRC_URI[md5sum] = "13b04fb59f81bf8a456ae21dbf7cdbe4"
SRC_URI[sha256sum] = "e3ea50970ef20f0b138ddda2b02e962e8ab814ebe035d551e6c205acb34fc7b2"

NPM_PKGNAME = "log-symbols"

inherit npmhelper
inherit native
