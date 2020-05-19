SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for Ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-3.4.1.tgz"
SRC_URI[md5sum] = "da70f4c71db0a2d0f7c15ddbe498ce19"
SRC_URI[sha256sum] = "1892b0f16b2b9d6b505c7874472f9e2bbbc19c5c4d9ad894fe3708e3f1e4863e"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
