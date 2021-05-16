SUMMARY = "NPM: p-map"
DESCRIPTION = "Map over promises concurrently"
HOMEPAGE = "https://github.com/sindresorhus/p-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-aggregate-error-native"

SRC_URI = "https://registry.npmjs.org/p-map/-/p-map-5.0.0.tgz"
SRC_URI[md5sum] = "edf40e34ba07689bd92709fc0e600433"
SRC_URI[sha256sum] = "d77012c47e2b27dc120cc4965d22805ab021d6e8e01beb84985ac006828baaf6"

NPM_PKGNAME = "p-map"

inherit npmhelper
inherit native
