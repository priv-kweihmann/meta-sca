SUMMARY = "NPM: is-bigint"
DESCRIPTION = "Is this value an ES BigInt?"
HOMEPAGE = "https://github.com/inspect-js/is-bigint#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = "npm-has-bigints-native"

SRC_URI = "https://registry.npmjs.org/is-bigint/-/is-bigint-1.0.4.tgz"
SRC_URI[md5sum] = "54f51f1529d609a8762b6f18a9fc5f39"
SRC_URI[sha256sum] = "4079a06416a7859fd7d4d7d62277b542664440d0a6e532312e177b4041254ed6"

NPM_PKGNAME = "is-bigint"

inherit npmhelper
inherit native
