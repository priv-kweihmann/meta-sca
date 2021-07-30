SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.32.tgz"
SRC_URI[md5sum] = "d803fdcd7daa79102652da503402e9eb"
SRC_URI[sha256sum] = "90c93d3f60abae86e13e906e51aadd6ad040489691bb03e4228e3354d4401692"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
