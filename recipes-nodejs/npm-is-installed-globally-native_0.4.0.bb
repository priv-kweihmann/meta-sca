SUMMARY = "NPM: is-installed-globally"
DESCRIPTION = "Check if your package was installed globally"
HOMEPAGE = "https://github.com/sindresorhus/is-installed-globally#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-global-dirs-native \
           npm-is-path-inside-native"

SRC_URI = "https://registry.npmjs.org/is-installed-globally/-/is-installed-globally-0.4.0.tgz"
SRC_URI[md5sum] = "7958f29c3f393acb2d9a044e692aa0a1"
SRC_URI[sha256sum] = "ca45a47c53b8bfa5ff979784aa17a88584f106ae7518c50d67e3ece74ac5afe0"

NPM_PKGNAME = "is-installed-globally"

inherit npmhelper
inherit native
