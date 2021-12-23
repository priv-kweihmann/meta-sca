SUMMARY = "NPM: create-eslint-index"
DESCRIPTION = "Simplify the creation an index file for your ESLint plugin"
HOMEPAGE = "https://github.com/jfmengels/create-eslint-index#readme"

DEPENDS = "npm-lodash.get-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1e5b333790e6b59d4d4d223304b5e80d"

SRC_URI = "https://registry.npmjs.org/create-eslint-index/-/create-eslint-index-1.0.0.tgz"
SRC_URI[md5sum] = "007858ccadb8b40776ddc6e8af495ef8"
SRC_URI[sha256sum] = "db656e10828e8f6bc8bb710c968143bce20e438f892e936d2bb1fefc837a1731"

NPM_PKGNAME = "create-eslint-index"

inherit npmhelper
inherit native
