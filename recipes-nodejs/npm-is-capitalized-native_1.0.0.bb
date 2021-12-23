SUMMARY = "NPM: is-capitalized"
DESCRIPTION = "Checks if an input string is a capitalized or not."
HOMEPAGE = "https://github.com/tjmehta/is-capitalized"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ab26a490f9c5c89580b409437dd3c48"

SRC_URI = "https://registry.npmjs.org/is-capitalized/-/is-capitalized-1.0.0.tgz"
SRC_URI[md5sum] = "e71396d692041d17d8faf0f85a67f0b6"
SRC_URI[sha256sum] = "441b7772a1a9c1d531c3598326717364afe81336dd66607ba0b448f7d89c86f0"

NPM_PKGNAME = "is-capitalized"

inherit npmhelper
inherit native
