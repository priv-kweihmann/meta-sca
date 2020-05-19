SUMMARY = "NPM: param-case"
DESCRIPTION = "Transform into a lower cased string with dashes between words"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/param-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-dot-case-native \
           npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/param-case/-/param-case-3.0.3.tgz"
SRC_URI[md5sum] = "5f5d8b7e72659b6e6ae397f7b2b63573"
SRC_URI[sha256sum] = "c2d4ab471d0ab83c0549fb93d2e3fdf6b3658b529d0529583985d15fe95929b4"

NPM_PKGNAME = "param-case"

inherit npmhelper
inherit native
