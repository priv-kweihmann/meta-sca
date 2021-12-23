SUMMARY = "NPM: known-css-properties"
DESCRIPTION = "List of known CSS properties"
HOMEPAGE = "https://github.com/known-css/known-css-properties#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37549544f16ed84cd09a09af0e78977f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/known-css-properties/-/known-css-properties-0.24.0.tgz"
SRC_URI[md5sum] = "7a3514d862a1e05c88d60dfca8e34852"
SRC_URI[sha256sum] = "afd00a85df60fe41705a78b3997d757f070fc632a2356e89531599d3c2b05b5e"

NPM_PKGNAME = "known-css-properties"

inherit npmhelper
inherit native
