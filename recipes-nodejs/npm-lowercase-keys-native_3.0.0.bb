SUMMARY = "NPM: lowercase-keys"
DESCRIPTION = "Lowercase the keys of an object"
HOMEPAGE = "https://github.com/sindresorhus/lowercase-keys#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lowercase-keys/-/lowercase-keys-3.0.0.tgz"
SRC_URI[md5sum] = "ef1a57f1a227fb9d34415ef7a1f8f7e2"
SRC_URI[sha256sum] = "ac56828edc1271b0c9e740bae1c17e54591d7d0f996cbc79e796c673429d0e71"

NPM_PKGNAME = "lowercase-keys"

inherit npmhelper
inherit native
