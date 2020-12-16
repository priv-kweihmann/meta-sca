SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for Ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-4.0.0.tgz"
SRC_URI[md5sum] = "f45bdaa5b92d80d6c2ed691122a21915"
SRC_URI[sha256sum] = "96e80990a80f640a0b329a4bf8b0448cb9258c32bf5b12d05a399998489eab72"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
