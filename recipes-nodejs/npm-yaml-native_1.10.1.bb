SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/v1/"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f43d95a153ee2ee3d2169246bae2f14b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-1.10.1.tgz"
SRC_URI[md5sum] = "bc78ef323debf2c46c082f8d0836c6d4"
SRC_URI[sha256sum] = "b06bb5b03ed4678fe80110ff97cb16748cb434d20c35f49631e577205136824e"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
