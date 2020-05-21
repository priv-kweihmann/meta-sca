SUMMARY = "NPM: yaml"
DESCRIPTION = "JavaScript parser and stringifier for YAML"
HOMEPAGE = "https://eemeli.org/yaml/"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f43d95a153ee2ee3d2169246bae2f14b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yaml/-/yaml-1.10.0.tgz"
SRC_URI[md5sum] = "d8683497b5568db0326005e20c3a4928"
SRC_URI[sha256sum] = "efef82417543cdb8e121f97084b87f1f3fda36fc24203c00c34a30a6b315b268"

NPM_PKGNAME = "yaml"

inherit npmhelper
inherit native
