SUMMARY = "NPM: object.fromentries"
DESCRIPTION = "ES proposal-spec-compliant Object.fromEntries shim."
HOMEPAGE = "https://github.com/es-shims/Object.fromEntries#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.fromentries/-/object.fromentries-2.0.5.tgz"
SRC_URI[md5sum] = "c330d973ffb2bbd8f50dd0fe52e641b6"
SRC_URI[sha256sum] = "477555a9a7a6e2f73e6ebd33907a57595cdba829936c700d3d3c3f0cb736d16a"

NPM_PKGNAME = "object.fromentries"

inherit npmhelper
inherit native
