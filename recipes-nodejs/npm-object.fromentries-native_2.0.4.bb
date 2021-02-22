SUMMARY = "NPM: object.fromentries"
DESCRIPTION = "ES proposal-spec-compliant Object.fromEntries shim."
HOMEPAGE = "https://github.com/es-shims/Object.fromEntries#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.fromentries/-/object.fromentries-2.0.4.tgz"
SRC_URI[md5sum] = "a1098f13589b48ab82ef94dceb70ff18"
SRC_URI[sha256sum] = "1936104c7e4584ab112da00a9b9da6c84ecf98a5dd274551c5ab0630ef018387"

NPM_PKGNAME = "object.fromentries"

inherit npmhelper
inherit native
