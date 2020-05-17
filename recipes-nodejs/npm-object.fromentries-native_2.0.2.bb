SUMMARY = "NPM: object.fromentries"
DESCRIPTION = "ES proposal-spec-compliant Object.fromEntries shim."
HOMEPAGE = "https://github.com/es-shims/Object.fromEntries#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native npm-function-bind-native npm-has-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

SRC_URI = "https://registry.npmjs.org/object.fromentries/-/object.fromentries-2.0.2.tgz"
SRC_URI[md5sum] = "aa0231931981b3d2a272ab6721fa8323"
SRC_URI[sha256sum] = "c48d77d8f39aeff499f43c4b6f6e29199bca56843a4123f566500aa161bdada9"

NPM_PKGNAME = "object.fromentries"

inherit npmhelper
inherit native
