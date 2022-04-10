SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=128142eeb7d706269284a8f0e5aa587c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-2.0.0.tgz"
SRC_URI[md5sum] = "8eb2a8c4bd8e13c75b9a0601da5d86c6"
SRC_URI[sha256sum] = "e195c6dd8c98635ff47dbd7a79b7676d4f158e57f576403c28e8950b1d3742dc"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
