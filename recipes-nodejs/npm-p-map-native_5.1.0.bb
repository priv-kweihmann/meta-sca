SUMMARY = "NPM: p-map"
DESCRIPTION = "Map over promises concurrently"
HOMEPAGE = "https://github.com/sindresorhus/p-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-aggregate-error-native"

SRC_URI = "https://registry.npmjs.org/p-map/-/p-map-5.1.0.tgz"
SRC_URI[md5sum] = "ca082324e2471ea3c993e3a4d5b1a442"
SRC_URI[sha256sum] = "545977d522790af634ea70ae061fbfb074ab9a31dcca8ca0ecc1081855241238"

NPM_PKGNAME = "p-map"

inherit npmhelper
inherit native
