SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for Ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-3.5.1.tgz"
SRC_URI[md5sum] = "95d0ee33d9d7f56493b31045a3672b63"
SRC_URI[sha256sum] = "9c8cbe5114b38802d253312f9bf1c5dfbe370f23b8dff836f7533fe07be53c07"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
