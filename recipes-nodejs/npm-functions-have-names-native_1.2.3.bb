SUMMARY = "NPM: functions-have-names"
DESCRIPTION = "Does this JS environment support the `name` property on functions?"
HOMEPAGE = "https://github.com/inspect-js/functions-have-names#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/functions-have-names/-/functions-have-names-1.2.3.tgz"
SRC_URI[md5sum] = "89a2b8928f2e27c2087690ab9f5d846a"
SRC_URI[sha256sum] = "3be0c99c006f7c53093e3f6a56a1128f1a72fec3b041ec585a4175b809fab1dc"

NPM_PKGNAME = "functions-have-names"

inherit npmhelper
inherit native
