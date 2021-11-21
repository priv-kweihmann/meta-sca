SUMMARY = "NPM: known-css-properties"
DESCRIPTION = "List of known CSS properties"
HOMEPAGE = "https://github.com/known-css/known-css-properties#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37549544f16ed84cd09a09af0e78977f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/known-css-properties/-/known-css-properties-0.23.0.tgz"
SRC_URI[md5sum] = "f62cbdad3370361d0245745ad14a53a8"
SRC_URI[sha256sum] = "77928325474a5aab3ab8405b410c38899df997e29a56ac30dad76cbb9e2f506b"

NPM_PKGNAME = "known-css-properties"

inherit npmhelper
inherit native
