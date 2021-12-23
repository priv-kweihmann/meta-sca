SUMMARY = "NPM: is-plain-obj"
DESCRIPTION = "Check if a value is a plain object"
HOMEPAGE = "https://github.com/sindresorhus/is-plain-obj#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-plain-obj/-/is-plain-obj-4.0.0.tgz"
SRC_URI[md5sum] = "4d8fd29dd0b9bcca72576c93437d58bd"
SRC_URI[sha256sum] = "c2af7865f873d95f5c564ca9ca6c251cecf70c1a37595b313ac1270a07615214"

NPM_PKGNAME = "is-plain-obj"

inherit npmhelper
inherit native
