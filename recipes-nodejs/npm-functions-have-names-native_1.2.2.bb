SUMMARY = "NPM: functions-have-names"
DESCRIPTION = "Does this JS environment support the `name` property on functions?"
HOMEPAGE = "https://github.com/inspect-js/functions-have-names#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/functions-have-names/-/functions-have-names-1.2.2.tgz"
SRC_URI[md5sum] = "b07b7c4068e59f92e1c8438134a7ffcd"
SRC_URI[sha256sum] = "a3d8e2013d04fa57e48bb871cb9a00b86be852825e1165d3682851810e186a71"

NPM_PKGNAME = "functions-have-names"

inherit npmhelper
inherit native
