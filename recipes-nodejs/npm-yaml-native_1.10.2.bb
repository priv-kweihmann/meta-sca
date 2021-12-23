SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/v1/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f43d95a153ee2ee3d2169246bae2f14b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-1.10.2.tgz"
SRC_URI[md5sum] = "dab724772bdd43c416fbe046ad0b1200"
SRC_URI[sha256sum] = "3dcf035ab6eced0862953bf4c09f5d9a431a1a565cf2bab9166d09183ae4e08d"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
