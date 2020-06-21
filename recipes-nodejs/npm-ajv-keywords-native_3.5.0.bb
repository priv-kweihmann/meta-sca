SUMMARY = "NPM: ajv-keywords"
DESCRIPTION = "Custom JSON-Schema keywords for Ajv validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv-keywords#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=417f4a53535e2142253a61d7829dd0ad"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ajv-keywords/-/ajv-keywords-3.5.0.tgz"
SRC_URI[md5sum] = "4e6255835ede9de2afec7c4648f46ef6"
SRC_URI[sha256sum] = "8922e3c7542395caf7b87e518754a8fe6ed59e9d9ac3ce44fd01fc8905802e41"

NPM_PKGNAME = "ajv-keywords"

inherit npmhelper
inherit native
