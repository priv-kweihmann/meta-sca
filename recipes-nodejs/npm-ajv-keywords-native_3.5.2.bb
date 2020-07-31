SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for Ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-3.5.2.tgz"
SRC_URI[md5sum] = "32147d0f260564c47c0b8a22b17831ba"
SRC_URI[sha256sum] = "afeb6654da42498618b24913b09b54328a574a4b0bc27c251b48b25d9c806240"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
