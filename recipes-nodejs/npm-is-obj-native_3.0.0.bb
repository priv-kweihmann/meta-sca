SUMMARY = "NPM: is-obj"
DESCRIPTION = "Check if a value is an object"
HOMEPAGE = "https://github.com/sindresorhus/is-obj#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-obj/-/is-obj-3.0.0.tgz"
SRC_URI[md5sum] = "9513d81f1dc614267dd4a889de71e61e"
SRC_URI[sha256sum] = "ba90d66bd19d2d8e5ee3c1caaf04095a066e033f4192ebf9636ec3ca9445a045"

NPM_PKGNAME = "is-obj"

inherit npmhelper
inherit native
