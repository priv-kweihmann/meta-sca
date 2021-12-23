SUMMARY = "NPM: comma-separated-tokens"
DESCRIPTION = "Parse and stringify comma-separated tokens"
HOMEPAGE = "https://github.com/wooorm/comma-separated-tokens#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/comma-separated-tokens/-/comma-separated-tokens-2.0.2.tgz"
SRC_URI[md5sum] = "e1131888b5561edfa8617524a491c8eb"
SRC_URI[sha256sum] = "7d557663e269765a07d8a4d56d1f9ef28f45e7010557093ec809541204a8d8c7"

NPM_PKGNAME = "comma-separated-tokens"

inherit npmhelper
inherit native
