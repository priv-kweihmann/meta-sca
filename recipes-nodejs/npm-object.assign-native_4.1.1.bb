SUMMARY = "NPM: object.assign"
DESCRIPTION = "ES6 spec-compliant Object.assign shim. From https://github.com/es-shims/es6-shim"
HOMEPAGE = "https://github.com/ljharb/object.assign#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b439ca9e99134dee172a7cc6d989174"

DEPENDS = "npm-define-properties-native \
           npm-has-symbols-native \
           npm-object-keys-native"

SRC_URI = "https://registry.npmjs.org/object.assign/-/object.assign-4.1.1.tgz"
SRC_URI[md5sum] = "2a506b8df49711ff3fa2618ee1f695e4"
SRC_URI[sha256sum] = "14e97b9ca76bbf53c8642139a6ba8ed0b93b113e01ca388592ad5933e94d9782"

NPM_PKGNAME = "object.assign"

inherit npmhelper
inherit native
