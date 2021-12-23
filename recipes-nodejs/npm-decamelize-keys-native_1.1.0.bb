SUMMARY = "NPM: decamelize-keys"
DESCRIPTION = "Convert object keys from camelCase to lowercase with a custom separator"
HOMEPAGE = "https://github.com/dsblv/decamelize-keys#readme"

DEPENDS = "npm-decamelize-native npm-map-obj-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=ef5033eb270a4d6e859a3cd602513b14"

SRC_URI = "https://registry.npmjs.org/decamelize-keys/-/decamelize-keys-1.1.0.tgz"
SRC_URI[md5sum] = "294912c28fb012c526ea257cd78c481f"
SRC_URI[sha256sum] = "cd62846d97014858be1f6e967553a13e1857b2091c754f79d8090dd64287b635"

NPM_PKGNAME = "decamelize-keys"

inherit npmhelper
inherit native
